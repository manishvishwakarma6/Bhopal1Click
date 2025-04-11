package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnvironmentNoiseMonitoringStationModel;
import com.SmartCity.Bhopal1Click.service.EnvironmentNoiseMonitoringStationService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EnvironmentNoiseMonitoringStationController {

    private final EnvironmentNoiseMonitoringStationService service;

    public EnvironmentNoiseMonitoringStationController(EnvironmentNoiseMonitoringStationService service) {
        this.service = service;
    }

    @GetMapping("/environmentnoisemonitoringstations")
    public String getNoiseMonitoringStations(Model model) {
        List<EnvironmentNoiseMonitoringStationModel> stations = service.getAllNoiseMonitoringStations();
        model.addAttribute("stations", stations);
        return "environmentnoisemonitoringstations"; // Thymeleaf template name
    }
}
