package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.SpecificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class clientsController {


    private final ContactService contactService;
    private final SpecificationService specificationService;

    public clientsController(ContactService contactService, SpecificationService specificationService) {
        this.contactService = contactService;
        this.specificationService = specificationService;
    }

    @GetMapping("/clients.html")
    public String clients(Model model) {
        model.addAttribute("TitlePage", "Оптовым и корпоративным клиентам");
        model.addAttribute("specification", specificationService.getSpecification(1));
        model.addAttribute("contact", contactService.getContact(1));
        return "clients";
    }


}
