package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class passwordRecoveryController {

    private final ContactService contactService;

    public passwordRecoveryController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/password-recovery.html")
    public ModelAndView passwordRecoveryPage(Model model) {
        model.addAttribute("TitlePage", "Восстановление пароля");
        model.addAttribute("contact", contactService.getContact(1));

        return new ModelAndView("password-recovery");
    }

}
