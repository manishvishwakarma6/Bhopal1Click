package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EducationLibraryModel;
import com.SmartCity.Bhopal1Click.service.EducationLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationLibraryController {

    @Autowired
    private EducationLibraryService service;

    @GetMapping("/educationlibraries")
    public String showEducationLibraries(Model model) {
        List<EducationLibraryModel> libraries = service.getAllLibraries();
        model.addAttribute("libraries", libraries);
        return "educationlibraries";
    }
}
