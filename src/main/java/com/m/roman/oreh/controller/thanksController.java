package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thanksController {

    private final ContactService contactService;

    public thanksController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/thanks.html")
    public String  thanksPage(Model model) {
        model.addAttribute("TitlePage", "Заказ оформлен");
        model.addAttribute("contact", contactService.getContact(1));

        return "thanks";
    }

}
