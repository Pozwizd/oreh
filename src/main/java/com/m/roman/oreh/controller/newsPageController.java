package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class newsPageController {

    private final ContactService contactService;

    public newsPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/news-page.html")
    public String newsPage(Model model) {
        model.addAttribute("TitlePage", "Новость");
        model.addAttribute("contact", contactService.getContact(1));


        return "news-page";
    }

}
