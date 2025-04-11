package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnergySolarPlantModel;
import com.SmartCity.Bhopal1Click.service.EnergySolarPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EnergySolarPlantController {

    @Autowired
    private EnergySolarPlantService service;

    @GetMapping("/energysolarplants")
    public String showSolarPlants(Model model) {
        List<EnergySolarPlantModel> solarPlants = service.getAllSolarPlants();
        model.addAttribute("solarPlants", solarPlants);
        return "energysolarplants";
    }
}
