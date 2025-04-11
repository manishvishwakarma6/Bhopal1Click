package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TransportRailwayStationModel;
import com.SmartCity.Bhopal1Click.service.TransportRailwayStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransportRailwayStationController {

    @Autowired
    private TransportRailwayStationService service;

    @GetMapping("/railwaystations")
    public String getRailwayStations(Model model) {
        List<TransportRailwayStationModel> railwayStations = service.getAllRailwayStations();
        model.addAttribute("railwayStations", railwayStations);
        return "railwaystations";
    }
}
