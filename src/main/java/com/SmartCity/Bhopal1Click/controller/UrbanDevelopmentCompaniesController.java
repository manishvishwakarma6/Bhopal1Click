package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentCompaniesModel;
import com.SmartCity.Bhopal1Click.service.UrbanDevelopmentCompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UrbanDevelopmentCompaniesController {

    @Autowired
    private UrbanDevelopmentCompaniesService service;

    @GetMapping("/urbandevelopmentcompanies")
    public String viewCompanies(Model model) {
        List<UrbanDevelopmentCompaniesModel> companies = service.getAllCompanies();
        model.addAttribute("companies", companies);
        return "urbandevelopmentcompanies";
    }
}
