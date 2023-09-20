package com.m.roman.oreh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class blogPageController {


    @RequestMapping("/blog.html")
    public String blog(Model model) {


        return "blog";

    }

}
