package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registrationController {

    private final ContactService contactService;

    public registrationController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/registration.html")
    public ModelAndView registrationPage(Model model) {
        model.addAttribute("TitlePage", "Регистрация");
        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("registration");
    }

}

