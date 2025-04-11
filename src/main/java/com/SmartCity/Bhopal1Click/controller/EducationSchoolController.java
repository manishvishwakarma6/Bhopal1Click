package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EducationSchoolModel;
import com.SmartCity.Bhopal1Click.service.EducationSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationSchoolController {

    @Autowired
    private EducationSchoolService service;

    @GetMapping("/educationschools")
    public String showEducationSchools(Model model) {
        List<EducationSchoolModel> schools = service.getAllSchools();
        model.addAttribute("schools", schools);
        return "educationschools";
    }
}
