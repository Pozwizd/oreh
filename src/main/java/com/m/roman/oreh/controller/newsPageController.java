package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class newsPageController {

    private final ContactService contactService;

    public newsPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/news-page")
    public String newsPage(Model model) {
        model.addAttribute("contact", contactService.getContact(1));


        return "news-page";
    }

}
