package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.GovernmentProjectsModel;
import com.SmartCity.Bhopal1Click.service.GovernmentProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class GovernmentProjectsController {

    @Autowired
    private GovernmentProjectsService service;

    @GetMapping("/govtprojects")
    public String showGovernmentProjects(Model model) {
        List<GovernmentProjectsModel> projects = service.getAllProjects();
        model.addAttribute("projects", projects);
        return "govtprojects";
    }
}
