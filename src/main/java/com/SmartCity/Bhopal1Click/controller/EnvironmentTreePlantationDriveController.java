package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnvironmentTreePlantationDriveModel;
import com.SmartCity.Bhopal1Click.service.EnvironmentTreePlantationDriveService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EnvironmentTreePlantationDriveController {

    private final EnvironmentTreePlantationDriveService service;

    public EnvironmentTreePlantationDriveController(EnvironmentTreePlantationDriveService service) {
        this.service = service;
    }

    @GetMapping("/environmenttreeplantationdrives")
    public String getTreePlantationDrives(Model model) {
        List<EnvironmentTreePlantationDriveModel> drives = service.getAllTreePlantationDrives();
        model.addAttribute("drives", drives);
        return "environmenttreeplantationdrives"; // Thymeleaf template name
    }
}
