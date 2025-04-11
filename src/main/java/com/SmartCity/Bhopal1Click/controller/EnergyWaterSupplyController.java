package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnergyWaterSupplyModel;
import com.SmartCity.Bhopal1Click.service.EnergyWaterSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EnergyWaterSupplyController {

    @Autowired
    private EnergyWaterSupplyService service;

    @GetMapping("/watersupply")
    public String showWaterSupplies(Model model) {
        List<EnergyWaterSupplyModel> waterSupplies = service.getAllWaterSupplies();
        model.addAttribute("waterSupplies", waterSupplies);
        return "watersupply"; // This will map to water-supplies.html in Thymeleaf
    }
}
