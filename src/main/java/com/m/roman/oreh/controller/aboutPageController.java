package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class aboutPageController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;
    private final ProductService productService;

    public aboutPageController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
    }

    @RequestMapping("/about.html")
    public String aboutMe(Model model) {

        model.addAttribute("contact", contactService.getContact(1));
        return "about";
    }

}
