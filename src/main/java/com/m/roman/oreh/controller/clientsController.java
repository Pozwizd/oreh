package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class clientsController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;
    private final ProductService productService;

    public clientsController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
    }

    public String clients(Model model) {

        model.addAttribute("contact", contactService.getContact(1));
        return "clients";
    }


}
