package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productPageController {

    private final ContactService contactService;

    public productPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/product")
    public String productPage(Model model) {
        model.addAttribute("contact", contactService.getContact(1));
        return "product-page";
    }

}
