package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnvironmentAirQualityStationModel;
import com.SmartCity.Bhopal1Click.service.EnvironmentAirQualityStationService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EnvironmentAirQualityStationController {

    private final EnvironmentAirQualityStationService service;

    public EnvironmentAirQualityStationController(EnvironmentAirQualityStationService service) {
        this.service = service;
    }

    @GetMapping("/environmentairqualitystations")
    public String getAirQualityStations(Model model) {
        List<EnvironmentAirQualityStationModel> stations = service.getAllAirQualityStations();
        model.addAttribute("stations", stations);
        return "environmentairqualitystations"; // Thymeleaf template name
    }
}
