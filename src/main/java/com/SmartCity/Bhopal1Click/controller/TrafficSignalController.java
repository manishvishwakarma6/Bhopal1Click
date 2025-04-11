package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TrafficSignalModel;
import com.SmartCity.Bhopal1Click.service.TrafficSignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TrafficSignalController {

    @Autowired
    private TrafficSignalService service;

    @GetMapping("/trafficsignal")
    public String showTrafficSignals(Model model) {
        List<TrafficSignalModel> trafficSignals = service.getAllTrafficSignals();
        model.addAttribute("trafficSignals", trafficSignals);
        return "trafficsignal"; // This maps to traffic-signals.html
    }
}
