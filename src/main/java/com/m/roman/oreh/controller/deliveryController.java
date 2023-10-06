package com.m.roman.oreh.controller;

import com.m.roman.oreh.entity.MenuDelivery;
import com.m.roman.oreh.service.ContactService;
import com.m.roman.oreh.service.MenuDeliveryService;
import com.m.roman.oreh.service.SpecificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class deliveryController {

    private final ContactService contactService;
    private final SpecificationService specificationService;
    private final MenuDeliveryService menuDeliveryService;

    public deliveryController(ContactService contactService, SpecificationService specificationService, MenuDeliveryService menuDeliveryService) {
        this.contactService = contactService;
        this.specificationService = specificationService;
        this.menuDeliveryService = menuDeliveryService;
    }


    @GetMapping("/delivery.html")
    public ModelAndView delivery(Model model) {
        model.addAttribute("TitlePage", "Оплата и доставка");
        List<MenuDelivery> menuDeliveries = menuDeliveryService.getAllMenuDeliveries();
        model.addAttribute("menuDeliveries", menuDeliveries);

        model.addAttribute("specification", specificationService.getSpecification(1));
        model.addAttribute("contact", contactService.getContact(1));
        return new ModelAndView("delivery");

    }

}
