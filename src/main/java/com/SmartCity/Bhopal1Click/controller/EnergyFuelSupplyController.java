package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnergyFuelSupplyModel;
import com.SmartCity.Bhopal1Click.service.EnergyFuelSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EnergyFuelSupplyController {

    @Autowired
    private EnergyFuelSupplyService service;

    @GetMapping("/fuelsupply")
    public String showFuelSupplies(Model model) {
        List<EnergyFuelSupplyModel> fuelSupplies = service.getAllFuelSupplies();
        model.addAttribute("fuelSupplies", fuelSupplies);
        return "fuelsupply"; // This will map to fuel-supplies.html in Thymeleaf
    }
}
