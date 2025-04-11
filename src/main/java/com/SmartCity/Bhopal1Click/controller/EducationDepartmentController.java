package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EducationDepartmentModel;
import com.SmartCity.Bhopal1Click.service.EducationDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationDepartmentController {

    @Autowired
    private EducationDepartmentService service;

    @GetMapping("/educationdepartments")
    public String showEducationDepartments(Model model) {
        List<EducationDepartmentModel> departments = service.getAllDepartments();
        model.addAttribute("departments", departments);
        return "educationdepartments";
    }
}




