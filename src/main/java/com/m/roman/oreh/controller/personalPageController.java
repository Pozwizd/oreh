package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class personalPageController {

    private final ContactService contactService;

    public personalPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/personal.html")
    public ModelAndView personalPage(Model model) {
        model.addAttribute("TitlePage", "Личный кабинет");
        return new ModelAndView("personal");
    }

}
