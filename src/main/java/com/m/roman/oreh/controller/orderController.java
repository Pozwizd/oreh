package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class orderController {

    private final ContactService contactService;

    public orderController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/order")
    public String orderPage(Model model) {

        model.addAttribute("contact", contactService.getContact(1));

        return "order";
    }
}
