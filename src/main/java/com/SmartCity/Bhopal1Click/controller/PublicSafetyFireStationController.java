package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PublicSafetyFireStationModel;
import com.SmartCity.Bhopal1Click.service.PublicSafetyFireStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class PublicSafetyFireStationController {

    @Autowired
    private PublicSafetyFireStationService service;

    @GetMapping("/firestations")
    public String showFireStations(Model model) {
        List<PublicSafetyFireStationModel> fireStations = service.getAllFireStations();
        model.addAttribute("fireStations", fireStations);
        return "firestations";
    }
}
