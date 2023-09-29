package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotFoundController {

    private final ContactService contactService;

    public NotFoundController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/404")
    public String notFoundPage(Model model) {

        model.addAttribute("contact", contactService.getContact(1));

        return "404";
    }

}
