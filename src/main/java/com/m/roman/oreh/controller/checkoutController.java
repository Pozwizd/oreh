package com.m.roman.oreh.controller;

import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class checkoutController {

    private final ContactService contactService;

    public checkoutController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/checkout.html")
    public ModelAndView checkoutPage(Model model) {
        model.addAttribute("TitlePage", "Оформление заказа");
        model.addAttribute("contact", contactService.getContact(1));

        return new ModelAndView("checkout");
    }

}

