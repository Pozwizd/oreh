package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NotFoundController {

    private final ContactService contactService;

    public NotFoundController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/404.html")
    public ModelAndView notFoundPage(Model model) {
        model.addAttribute("TitlePage", "404");
        model.addAttribute("contact", contactService.getContact(1));

        return new ModelAndView("404");
    }

}
