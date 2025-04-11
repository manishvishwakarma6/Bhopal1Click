package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TransportBusStationModel;
import com.SmartCity.Bhopal1Click.service.TransportBusStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransportBusStationController {

    @Autowired
    private TransportBusStationService service;

    @GetMapping("/busstations")
    public String getBusStations(Model model) {
        List<TransportBusStationModel> busStations = service.getAllBusStations();
        model.addAttribute("busStations", busStations);
        return "busstations";
    }
}
