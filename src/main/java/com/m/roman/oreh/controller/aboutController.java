package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.SpecificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutController {


    private final ContactService contactService;
    private final SpecificationService specificationService;


    public aboutController(ContactService contactService, SpecificationService specificationService) {
        this.contactService = contactService;
        this.specificationService = specificationService;
    }

    @RequestMapping("/about.html")
    public String aboutMe(Model model) {
        model.addAttribute("TitlePage", "О компании");
        model.addAttribute("specification", specificationService.getSpecification(1));
        model.addAttribute("contact", contactService.getContact(1));
        return "about";
    }

}
