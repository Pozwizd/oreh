package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.SpecificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class newsController {

    private final ContactService contactService;

    public newsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/news")
    public String newsPage(Model model) {
        model.addAttribute("contact", contactService.getContact(1));
        return "news";
    }

}
