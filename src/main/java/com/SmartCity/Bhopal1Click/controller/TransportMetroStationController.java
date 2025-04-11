package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TransportMetroStationModel;
import com.SmartCity.Bhopal1Click.service.TransportMetroStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransportMetroStationController {

    @Autowired
    private TransportMetroStationService service;

    @GetMapping("/metrostations")
    public String getMetroStations(Model model) {
        List<TransportMetroStationModel> metroStations = service.getAllMetroStations();
        model.addAttribute("metroStations", metroStations);
        return "metrostations";
    }
}
