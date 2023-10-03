package com.m.roman.oreh.controller;


import com.m.roman.oreh.entity.Product;
import com.m.roman.oreh.repository.ProductRepository;
import com.m.roman.oreh.service.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class catalogController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;

    private final ProductService productService;
    private final MediaService mediaService;
    private ProductRepository productRepository;

    public catalogController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService, MediaService mediaService, ProductRepository productRepository) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.mediaService = mediaService;
        this.productRepository = productRepository;
    }


    @GetMapping("/catalog")
    public String portfolio(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("TitlePage", "Каталог продукции");
        for (int i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
        }
        //---------
        int pageSize = 6;

        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Product> productsPage = productRepository.findAll(pageable);

        model.addAttribute("products", productsPage.getContent());
        model.addAttribute("pageNum", page);


        //---------
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
