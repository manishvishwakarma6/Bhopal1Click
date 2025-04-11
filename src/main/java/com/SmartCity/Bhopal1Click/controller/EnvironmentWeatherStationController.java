package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnvironmentWeatherStationModel;
import com.SmartCity.Bhopal1Click.service.EnvironmentWeatherStationService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EnvironmentWeatherStationController {

    private final EnvironmentWeatherStationService service;

    public EnvironmentWeatherStationController(EnvironmentWeatherStationService service) {
        this.service = service;
    }

    @GetMapping("/environmentweatherstations")
    public String getWeatherStations(Model model) {
        List<EnvironmentWeatherStationModel> stations = service.getAllWeatherStations();
        model.addAttribute("stations", stations);
        return "environmentweatherstations"; // Thymeleaf template name
    }
}
