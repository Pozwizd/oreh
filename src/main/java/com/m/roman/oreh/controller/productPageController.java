package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class productPageController {

    private final ContactService contactService;

    public productPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/product-page.html")
    public ModelAndView productPage(Model model) {
        model.addAttribute("TitlePage", "Карточка товара");
        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("product-page");
    }

}
