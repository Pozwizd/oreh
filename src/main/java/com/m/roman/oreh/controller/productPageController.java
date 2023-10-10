package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class productPageController {


    private final ContactService contactService;
    private final ProductService productService;

    public productPageController(ContactService contactService, ProductService productService) {
        this.contactService = contactService;
        this.productService = productService;
    }

    @GetMapping("/product-page.html")
    public ModelAndView productPage(Model model) {
        model.addAttribute("TitlePage", "Карточка товара");
        model.addAttribute("product", productService.getProduct(1L));
        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("product-page");
    }

}
