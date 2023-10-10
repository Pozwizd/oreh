package com.m.roman.oreh.controller;

import com.m.roman.oreh.model.News;
import com.m.roman.oreh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class aboutController {

    // TODO: Добавить статьи

    private final TitleTextService titleTextService;
    private final ArticleService articleService;
    private final ContactService contactService;
    private final NewsService newsService;
    private final SpecificationService specificationService;


    public aboutController(TitleTextService titleTextService, ArticleService articleService, ContactService contactService, NewsService newsService, SpecificationService specificationService) {
        this.titleTextService = titleTextService;
        this.articleService = articleService;
        this.contactService = contactService;
        this.newsService = newsService;
        this.specificationService = specificationService;
    }

    @GetMapping("/about.html")
    public ModelAndView aboutMe(Model model) {
        model.addAttribute("TitlePage", "О компании");
        model.addAttribute("titleText1", titleTextService.getTitleText(1));
        model.addAttribute("titleText5", titleTextService.getTitleText(5));
        model.addAttribute("titleText8", titleTextService.getTitleText(8));
        model.addAttribute("specification", specificationService.getSpecification(1));
        for (int i = 6; i <= 12; i++) {
            model.addAttribute("article" + i, articleService.getArticle(i));
        }
        List<News> news = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            news.add(newsService.getNews(i));
        }
        model.addAttribute("news", news);


        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("about");
    }

}
