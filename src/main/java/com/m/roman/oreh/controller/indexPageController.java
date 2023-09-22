package com.m.roman.oreh.controller;


import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexPageController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;

    private final ProductService productService;

    public indexPageController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
    }


    @RequestMapping("/")
    public String index(Model model) {

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
        }

        for (int i = 1; i <= 6; i++) {
            model.addAttribute("product" + i, productService.getProduct(i));
        }

        model.addAttribute("contact", contactService.getContact(1));

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }

        for (int i = 1; i <= 4; i++) {
            model.addAttribute("news" + i, newsService.getNews(i));
        }

        return "index";
    }

    @RequestMapping("/index.html")
    public String mainPage(Model model) {
        return "redirect:/";
    }
}
