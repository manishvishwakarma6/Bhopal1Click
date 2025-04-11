package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TransportAirportsModel;
import com.SmartCity.Bhopal1Click.service.TransportAirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransportAirportsController {

    @Autowired
    private TransportAirportsService service;

    @GetMapping("/airports")
    public String showAirports(Model model) {
        List<TransportAirportsModel> airports = service.getAllAirports();
        model.addAttribute("airports", airports);
        return "airports";
    }
}
