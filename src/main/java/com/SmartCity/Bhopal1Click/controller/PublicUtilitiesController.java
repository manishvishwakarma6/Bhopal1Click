package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PublicUtilitiesModel;
import com.SmartCity.Bhopal1Click.service.PublicUtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PublicUtilitiesController {

    @Autowired
    private PublicUtilitiesService service;

    @GetMapping("/publicutilities")
    public String viewPublicUtilities(Model model) {
        List<PublicUtilitiesModel> utilities = service.getAllPublicUtilities();
        model.addAttribute("utilities", utilities);
        return "publicutilities";
    }
}
