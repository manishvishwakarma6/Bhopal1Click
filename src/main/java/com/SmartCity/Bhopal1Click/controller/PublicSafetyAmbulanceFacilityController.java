package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PublicSafetyAmbulanceFacility;
import com.SmartCity.Bhopal1Click.service.PublicSafetyAmbulanceFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PublicSafetyAmbulanceFacilityController {

    @Autowired
    private PublicSafetyAmbulanceFacilityService service;

    @GetMapping("/ambulancefacilities")
    public String showAmbulanceFacilities(Model model) {
        List<PublicSafetyAmbulanceFacility> facilities = service.getAllAmbulanceFacilities();
        model.addAttribute("facilities", facilities);
        return "ambulancefacilities"; // Thymeleaf template name
    }
}
