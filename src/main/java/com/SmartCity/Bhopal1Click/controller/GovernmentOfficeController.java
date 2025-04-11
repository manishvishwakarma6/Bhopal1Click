package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.GovernmentOfficeModel;
import com.SmartCity.Bhopal1Click.service.GovernmentOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GovernmentOfficeController {

    @Autowired
    private GovernmentOfficeService service;

    @GetMapping("/governmentoffices")
    public String viewGovernmentOffices(Model model) {
        List<GovernmentOfficeModel> offices = service.getAllGovernmentOffices();
        model.addAttribute("offices", offices);
        return "governmentoffices";
    }
}
