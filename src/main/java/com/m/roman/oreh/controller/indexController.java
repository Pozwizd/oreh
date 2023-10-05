package com.m.roman.oreh.controller;


import com.m.roman.oreh.entity.News;
import com.m.roman.oreh.entity.Product;
import com.m.roman.oreh.service.*;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

// TODO: 03.10.2023 Сделать прогрузку продуктов с картинками

@Controller
public class indexController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;
    private final ProductService productService;
    private final SpecificationService specificationService;


    public indexController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService, MediaService mediaService, SpecificationService specificationService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.specificationService = specificationService;
    }

    @GetMapping({"/", ""})
    public ModelAndView index(Model model) {
        model.addAttribute("TitlePage", "Орех Причерноморья");

        for (long i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
            model.addAttribute("article" + i, articleService.getArticle(i));
        }

        int pageSize = 7;
        Slice<Product> productsPage = productService.getAllProducts(0, pageSize);

        model.addAttribute("products", productsPage.getContent());


        List<News> news = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            news.add(newsService.getNews(i));
        }
        model.addAttribute("news", news);

        model.addAttribute("specification", specificationService.getSpecification(1L));
        model.addAttribute("contact", contactService.getContact(1L));

        return new ModelAndView("index");
    }
}
