package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class newsPageController {

    // TODO: Добавить последние публикации

    private final ContactService contactService;
    private final NewsService newsService;

    public newsPageController(ContactService contactService, NewsService newsService) {
        this.contactService = contactService;
        this.newsService = newsService;
    }

    @GetMapping("/news-page.html")
    public ModelAndView newsPage(Model model) {
        model.addAttribute("TitlePage", "Новость");

        model.addAttribute("news", newsService.getAllNews());

        model.addAttribute("contact", contactService.getContact(1));


        return new ModelAndView("news-page");
    }

}
