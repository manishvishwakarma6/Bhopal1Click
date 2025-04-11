package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentHousingProjectsModel;
import com.SmartCity.Bhopal1Click.service.UrbanDevelopmentHousingProjectsService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UrbanDevelopmentHousingProjectsController {

    private final UrbanDevelopmentHousingProjectsService service;

    public UrbanDevelopmentHousingProjectsController(UrbanDevelopmentHousingProjectsService service) {
        this.service = service;
    }

    @GetMapping("/urbandevelopmenthousingprojects")
    public String getHousingProjects(Model model) {
        List<UrbanDevelopmentHousingProjectsModel> projects = service.getAllHousingProjects();
        model.addAttribute("projects", projects);
        return "urbandevelopmenthousingprojects"; // Thymeleaf template name
    }
}
