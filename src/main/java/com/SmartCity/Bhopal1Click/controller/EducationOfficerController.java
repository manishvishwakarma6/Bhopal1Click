package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EducationOfficerModel;
import com.SmartCity.Bhopal1Click.service.EducationOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationOfficerController {

    @Autowired
    private EducationOfficerService service;

    @GetMapping("/educationofficers")
    public String showEducationOfficers(Model model) {
        List<EducationOfficerModel> officers = service.getAllOfficers();
        model.addAttribute("officers", officers);
        return "educationofficers";
    }
}
