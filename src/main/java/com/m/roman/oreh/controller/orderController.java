package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class orderController {

    private final ContactService contactService;

    public orderController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/order.html")
    public String orderPage(Model model) {
        model.addAttribute("TitlePage", "Заказ");
        model.addAttribute("contact", contactService.getContact(1));

        return "order";
    }
}
