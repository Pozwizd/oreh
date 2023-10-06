package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class newsController {

    // TODO: Добавить статьи

    private final ContactService contactService;

    public newsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/news.html")
    public ModelAndView newsPage(Model model) {
        model.addAttribute("TitlePage", "Новости и статьи");
        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("news");
    }

}
