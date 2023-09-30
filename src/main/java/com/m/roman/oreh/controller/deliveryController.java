package com.m.roman.oreh.controller;

import com.m.roman.oreh.entity.MenuDelivery;
import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class deliveryController {

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final NewsService newsService;
    private final ContactService contactService;
    private final ProductService productService;
    private final SpecificationService specificationService;

    private final MenuDeliveryService menuDeliveryService;

    public deliveryController(TitleTextService titleTextService, ArticleService articleService, NewsService newsService, ContactService contactService, ProductService productService, SpecificationService specificationService, MenuDeliveryService menuDeliveryService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.newsService = newsService;
        this.contactService = contactService;
        this.productService = productService;
        this.specificationService = specificationService;
        this.menuDeliveryService = menuDeliveryService;
    }


    @RequestMapping("/delivery.html")
    public String delivery(Model model) {
        List<MenuDelivery> menuDeliveries = menuDeliveryService.getAllMenuDeliveries();
        model.addAttribute("menuDeliveries", menuDeliveries);

        model.addAttribute("specification", specificationService.getSpecification(1));
        model.addAttribute("contact", contactService.getContact(1));
        return "delivery";

    }

}
