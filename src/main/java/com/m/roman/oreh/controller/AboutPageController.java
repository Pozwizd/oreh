package com.m.roman.oreh.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class AboutPageController {


    @RequestMapping("/about.html")
    public String aboutMe(Model model) {


        return "about";
    }

}
