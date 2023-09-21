package com.m.roman.oreh.controller;


import com.m.roman.oreh.entity.*;
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
            TitleText titleText = titleTextService.getTitleText(i);
            model.addAttribute("titleText" + i, titleText);
        }

        for (int i = 1; i <= 6; i++) {
            Product product = productService.getProduct(i);
            model.addAttribute("product" + i, product);
        }

        for (int i = 1; i <= 4; i++) {
            Contact contact = contactService.getContact(i);
            model.addAttribute("contact" + i, contact);
        }

        for (int i = 1; i <= 4; i++) {
            Article article = articleService.getArticle(i);
            model.addAttribute("article" + i, article);
        }

        for (int i = 1; i <= 4; i++) {
            News news = newsService.getNews(i);
            model.addAttribute("news" + i, news);
        }

        return "index";
    }

    @RequestMapping("/index.html")
    public String mainPage(Model model) {
        return "redirect:/";
    }
}
