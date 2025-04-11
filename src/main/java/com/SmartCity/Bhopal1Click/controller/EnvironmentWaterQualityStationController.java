package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnvironmentWaterQualityStationModel;
import com.SmartCity.Bhopal1Click.service.EnvironmentWaterQualityStationService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EnvironmentWaterQualityStationController {

    private final EnvironmentWaterQualityStationService service;

    public EnvironmentWaterQualityStationController(EnvironmentWaterQualityStationService service) {
        this.service = service;
    }

    @GetMapping("/environmentwaterqualitystations")
    public String getWaterQualityStations(Model model) {
        List<EnvironmentWaterQualityStationModel> stations = service.getAllWaterQualityStations();
        model.addAttribute("stations", stations);
        return "environmentwaterqualitystations"; // Thymeleaf template name
    }
}
