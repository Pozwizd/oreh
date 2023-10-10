package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ArticleService;
import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.TitleTextService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class galleryPageController {



    private final ContactService contactService;
    private final TitleTextService titleTextService;
    private final ArticleService articleService;

    public galleryPageController(ContactService contactService, TitleTextService titleTextService, ArticleService articleService) {
        this.contactService = contactService;
        this.titleTextService = titleTextService;
        this.articleService = articleService;
    }

    @GetMapping("/gallery.html")
    public ModelAndView galleryPage(Model model) {
        model.addAttribute("TitlePage", "Галлерея");

        model.addAttribute("titleText8", titleTextService.getTitleText(8));
        for (int i = 8; i <= 12; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }

        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("gallery");
    }

}
