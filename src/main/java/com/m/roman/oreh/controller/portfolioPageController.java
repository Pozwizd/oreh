package com.m.roman.oreh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class portfolioPageController {


    @RequestMapping("/portfolio.html")
    public String portfolio(Model model) {

        return "portfolio";
    }

}
