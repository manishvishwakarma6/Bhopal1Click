package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UtilityServicesElectronicsModel;
import com.SmartCity.Bhopal1Click.service.UtilityServicesElectronicsService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UtilityServicesElectronicsController {

    private final UtilityServicesElectronicsService service;

    public UtilityServicesElectronicsController(UtilityServicesElectronicsService service) {
        this.service = service;
    }

    @GetMapping("/utilityserviceelectronics")
    public String getElectronics(Model model) {
        List<UtilityServicesElectronicsModel> electronics = service.getAllElectronicShops();
        model.addAttribute("electronics", electronics);
        return "utilityserviceelectronics"; // Thymeleaf template name
    }
}
