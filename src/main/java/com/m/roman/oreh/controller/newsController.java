package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class newsController {

    private final ContactService contactService;

    public newsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/news.html")
    public String newsPage(Model model) {
        model.addAttribute("TitlePage", "Новости и статьи");
        model.addAttribute("contact", contactService.getContact(1));
        return "news";
    }

}
