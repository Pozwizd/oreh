package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class thanksController {

    private final ContactService contactService;

    public thanksController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/thanks.html")
    public ModelAndView thanksPage(Model model) {
        model.addAttribute("TitlePage", "Заказ оформлен");
        model.addAttribute("contact", contactService.getContact(1));

        return new ModelAndView("thanks");
    }

}
