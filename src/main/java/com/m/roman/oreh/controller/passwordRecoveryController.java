package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class passwordRecoveryController {

    private final ContactService contactService;

    public passwordRecoveryController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/password-recovery")
    public String  passwordRecoveryPage(Model model) {

        model.addAttribute("contact", contactService.getContact(1));

        return "password-recovery";
    }

}
