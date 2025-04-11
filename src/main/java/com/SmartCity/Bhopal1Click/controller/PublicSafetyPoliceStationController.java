package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PublicSafetyPoliceStationModel;
import com.SmartCity.Bhopal1Click.service.PublicSafetyPoliceStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PublicSafetyPoliceStationController {

    @Autowired
    private PublicSafetyPoliceStationService service;

    @GetMapping("/policestations")
    public String showPoliceStations(Model model) {
        List<PublicSafetyPoliceStationModel> policeStations = service.getAllPoliceStations();
        model.addAttribute("policeStations", policeStations);
        return "policestations"; // This maps to policestations.html in Thymeleaf
    }
}
