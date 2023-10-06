package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class passwordController {

    private final ContactService contactService;

    public passwordController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/password.html")
    public ModelAndView password(Model model) {
        model.addAttribute("TitlePage", "Пароль");
        model.addAttribute("contact", contactService.getContact(1));

        return new ModelAndView("password");
    }
}
