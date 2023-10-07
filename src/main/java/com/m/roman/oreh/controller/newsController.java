package com.m.roman.oreh.controller;

import com.m.roman.oreh.model.News;
import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.NewsService;
import com.m.roman.oreh.service.TitleTextService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class newsController {

    // TODO: Добавить статьи

    private final ContactService contactService;
    private final NewsService newsService;
    private final TitleTextService titleTextService;

    public newsController(ContactService contactService, NewsService newsService, TitleTextService titleTextService) {
        this.contactService = contactService;
        this.newsService = newsService;
        this.titleTextService = titleTextService;
    }

    @GetMapping("/news.html")
    public ModelAndView newsPage(Model model) {
        model.addAttribute("TitlePage", "Новости и статьи");
        model.addAttribute("contact", contactService.getContact(1));
        model.addAttribute("newsTop", newsService.getNews(5));
        List<News> news = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            news.add(newsService.getNews(i));
        }
        model.addAttribute("news", news);
        model.addAttribute("titleText", titleTextService.getTitleText(8));




        return new ModelAndView("news");
    }

}
