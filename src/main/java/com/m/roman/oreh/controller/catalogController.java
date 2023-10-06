package com.m.roman.oreh.controller;


import com.m.roman.oreh.entity.Product;
import com.m.roman.oreh.service.*;
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
    // TODO: Типы продукта

    @GetMapping("/catalog.html")
    public ModelAndView portfolio(Model model,
                                  @RequestParam(required = false, defaultValue = "0") int page) {
        model.addAttribute("TitlePage", "Каталог продукции");
        for (int i = 1; i <= 5; i++) {
            model.addAttribute("titleText" + i, titleTextService.getTitleText(i));
        }
        //---------

        // пагинация на уровле контроллера
        int pageNumber = 0;
        int pageSize = 6;

        if (page != 0) {
            pageNumber = page;
        }
        Slice<Product> productsPage = productService.getAllProducts(page, pageSize);

        model.addAttribute("products", productsPage.getContent());
        model.addAttribute("currentPage", page);


        //---------
        model.addAttribute("contact", contactService.getContact(1));

        for (int i = 1; i <= 5; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }

        for (int i = 1; i <= 4; i++) {
            model.addAttribute("news" + i, newsService.getNews(i));
        }
        return new ModelAndView("catalog");
    }

}
