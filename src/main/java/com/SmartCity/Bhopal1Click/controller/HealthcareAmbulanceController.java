package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.HealthcareAmbulanceModel;
import com.SmartCity.Bhopal1Click.service.HealthcareAmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HealthcareAmbulanceController {

    @Autowired
    private HealthcareAmbulanceService service;

    @GetMapping("/healthcareambulances")
    public String showAmbulances(Model model) {
        List<HealthcareAmbulanceModel> ambulances = service.getAllAmbulances();
        model.addAttribute("ambulances", ambulances);
        return "healthcareambulances";
    }
}
