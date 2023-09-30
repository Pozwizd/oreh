package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class clientsController {


    private final ContactService contactService;
    private final SpecificationService specificationService;

    public clientsController(ContactService contactService, SpecificationService specificationService) {
        this.contactService = contactService;
        this.specificationService = specificationService;
    }

    public String clients(Model model) {
        model.addAttribute("specification", specificationService.getSpecification(1));
        model.addAttribute("contact", contactService.getContact(1));
        return "clients";
    }


}
