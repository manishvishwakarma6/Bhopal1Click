package com.SmartCity.Bhopal1Click.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.SmartCity.Bhopal1Click.model.EnvironmentMonitoringModel;
import com.SmartCity.Bhopal1Click.service.EnvironmentMonitoringService;

import java.util.List;

@Controller
public class EnvironmentMonitoringController {

    private final EnvironmentMonitoringService service;

    public EnvironmentMonitoringController(EnvironmentMonitoringService service) {
        this.service = service;
    }

    @GetMapping("/environmentmonitoring")
    public String getEnvironmentData(Model model) {
        List<EnvironmentMonitoringModel> data = service.getAllEnvironmentData();
        model.addAttribute("environmentData", data);
        return "environmentmonitoring"; // Thymeleaf template name
    }
}
