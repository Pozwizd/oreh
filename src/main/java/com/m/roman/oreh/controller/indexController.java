package com.m.roman.oreh.controller;


import com.m.roman.oreh.entity.Media;
import com.m.roman.oreh.entity.News;
import com.m.roman.oreh.entity.Product;
import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class indexController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;
    private final ProductService productService;
    private final MediaService mediaService;
    private final SpecificationService specificationService;

    public indexController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService, MediaService mediaService, SpecificationService specificationService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.mediaService = mediaService;
        this.specificationService = specificationService;
    }


    @RequestMapping("/index")
    public String index(Model model) {

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
        }
        //        -------------------------------------------------

        model.addAttribute("products", productService.getAllProducts());

        //        -------------------------------------------------
        for (int i = 1; i <= 5; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }
        //        -------------------------------------------------
        List<News> news = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            news.add(newsService.getNews(i));
        }
        model.addAttribute("news", news);
        //        -------------------------------------------------

        model.addAttribute("specification", specificationService.getSpecification(1));
        model.addAttribute("contact", contactService.getContact(1));
        return "index";
    }
    @RequestMapping("/")
    public String mainPage(Model model) {
        return "redirect:/index";
    }
}
