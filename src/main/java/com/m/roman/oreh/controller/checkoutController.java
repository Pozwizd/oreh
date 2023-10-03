package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class checkoutController {

    private final ContactService contactService;

    public checkoutController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/checkout.html")
    public String checkoutPage(Model model) {
        model.addAttribute("TitlePage", "Оформление заказа");
        model.addAttribute("contact", contactService.getContact(1));

        return "checkout";
    }

}

