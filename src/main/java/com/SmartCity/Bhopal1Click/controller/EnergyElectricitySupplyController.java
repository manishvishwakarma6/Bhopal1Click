package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnergyElectricitySupplyModel;
import com.SmartCity.Bhopal1Click.service.EnergyElectricitySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EnergyElectricitySupplyController {

    @Autowired
    private EnergyElectricitySupplyService service;

    @GetMapping("/electricitysupply")
    public String viewElectricitySupply(Model model) {
        List<EnergyElectricitySupplyModel> electricitySupplies = service.getAllElectricitySupplies();
        model.addAttribute("electricitySupplies", electricitySupplies);
        return "electricitySupply"; // Thymeleaf template name
    }
}
