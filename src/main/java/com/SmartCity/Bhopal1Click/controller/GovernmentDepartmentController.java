package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.GovernmentDepartmentModel;
import com.SmartCity.Bhopal1Click.service.GovernmentDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GovernmentDepartmentController {

    @Autowired
    private GovernmentDepartmentService service;

    @GetMapping("/govtdepartments")
    public String showDepartments(Model model) {
        List<GovernmentDepartmentModel> departments = service.getAllDepartments();
        model.addAttribute("departments", departments);
        return "govtdepartments";
    }
}
