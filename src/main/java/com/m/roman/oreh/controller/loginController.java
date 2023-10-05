package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    private final ContactService contactService;

    public loginController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/login.html")
    public String loginPage(Model model) {
        model.addAttribute("TitlePage", "Вход");

        model.addAttribute("contact", contactService.getContact(1));

        return "login";
    }

}
