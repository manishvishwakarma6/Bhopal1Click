package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EducationUniversityModel;
import com.SmartCity.Bhopal1Click.service.EducationUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationUniversityController {

    @Autowired
    private EducationUniversityService service;

    @GetMapping("/educationuniversities")
    public String showEducationUniversities(Model model) {
        List<EducationUniversityModel> universities = service.getAllUniversities();
        model.addAttribute("universities", universities);
        return "educationuniversities";
    }
}
