package com.m.roman.oreh.controller;


import com.m.roman.oreh.entity.Media;
import com.m.roman.oreh.entity.Product;
import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class catalogController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;

    private final ProductService productService;
    private final MediaService mediaService;
    public catalogController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService, MediaService mediaService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.mediaService = mediaService;
    }


    @RequestMapping("/catalog.html")
    public String portfolio(Model model) {

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
        }

        List<Product> products = productService.getAllProducts();
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < 3; j++) {
                products.get(i).addMedia(mediaService.getMedia(i+1));
            }
        }

        model.addAttribute("products", products);

        model.addAttribute("contact", contactService.getContact(1));

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }

        for (int i = 1; i <= 4; i++) {
            model.addAttribute("news" + i, newsService.getNews(i));
        }
        return "catalog";
    }

}
