package com.m.roman.oreh.controller;


import com.m.roman.oreh.model.Product;
import com.m.roman.oreh.service.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class catalogController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;
    private final ProductService productService;
    private final MediaService mediaService;

    public catalogController(TitleTextService titleTextService,
                             ArticleService articleService,
                             NewsService newsService,
                             ContactService contactService,
                             ProductService productService,
                             MediaService mediaService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.mediaService = mediaService;
    }


    // TODO: Фильтрация

    @GetMapping("/catalog.html")
    public ModelAndView portfolio(Model model,
                                  @RequestParam(required = false, defaultValue = "0") int page) {
        model.addAttribute("TitlePage", "Каталог продукции");

        model.addAttribute("titleText7", titleTextService.getTitleText(7));
        model.addAttribute("article5", articleService.getArticle(5));


        int pageNumber = 0;
        int pageSize = 6;

        if (page != 0) {
            pageNumber = page;
        }
        Page<Product> productsPage = productService.getAllProducts(page, pageSize);

        model.addAttribute("products", productsPage.getContent());
        model.addAttribute("currentPage", page);
        //---------

        model.addAttribute("contact", contactService.getContact(1));


        return new ModelAndView("catalog");
    }

}
