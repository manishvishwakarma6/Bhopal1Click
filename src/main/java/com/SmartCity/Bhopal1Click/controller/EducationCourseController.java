package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EducationCourseModel;
import com.SmartCity.Bhopal1Click.service.EducationCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationCourseController {

    @Autowired
    private EducationCourseService service;

    @GetMapping("/educationcourses")
    public String showEducationCourses(Model model) {
        List<EducationCourseModel> courses = service.getAllCourses();
        model.addAttribute("courses", courses);
        return "educationcourses";
    }
}
