package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class personalPageController {

    private final ContactService contactService;

    public personalPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/personal")
    public String personalPage(Model model) {
        return "personal-page";
    }

}
