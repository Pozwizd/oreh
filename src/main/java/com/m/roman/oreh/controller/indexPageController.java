package com.m.roman.oreh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexPageController {


    @RequestMapping("/")
    public String index(Model model) {


        return "index";
    }

    @RequestMapping("/index.html")
    public String mainPage(Model model) {
        return "redirect:/";
    }
}
