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
public class indexController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;

    private final ProductService productService;

    private final MediaService mediaService;

    public indexController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService, MediaService mediaService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.mediaService = mediaService;
    }


    @RequestMapping("/index")
    public String index(Model model) {

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
        }
        //        -------------------------------------------------
        List<Product> products = productService.getAllProducts();
        int u = 0;
        for (Product product : products) {
            u =+ 1;
            List<Media> mediaList = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                mediaList.add(mediaService.getMedia(u));
            }
            product.setMediaList(mediaList);
        }
        //        -------------------------------------------------
        for (int i = 1; i <= 5; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }
        //        -------------------------------------------------
        for (int i = 1; i <= 4; i++) {
            model.addAttribute("news" + i, newsService.getNews(i));
        }
        //        -------------------------------------------------
        model.addAttribute("contact", contactService.getContact(1));
        return "index";
    }
    @RequestMapping("/")
    public String mainPage(Model model) {
        return "redirect:/index";
    }
}
