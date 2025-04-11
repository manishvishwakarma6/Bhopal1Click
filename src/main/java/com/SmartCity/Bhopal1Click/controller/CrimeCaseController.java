package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.CrimeCaseModel;
import com.SmartCity.Bhopal1Click.service.CrimeCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CrimeCaseController {

    @Autowired
    private CrimeCaseService crimeCaseService;

    @GetMapping("/crimecases")
    public String showCrimeCases(Model model) {
        List<CrimeCaseModel> crimeCases = crimeCaseService.getAllCrimeCases();
        model.addAttribute("crimeCases", crimeCases);
        return "crimecases";
    }
}
