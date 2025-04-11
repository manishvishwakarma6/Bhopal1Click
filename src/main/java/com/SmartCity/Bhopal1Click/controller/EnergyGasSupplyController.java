package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EnergyGasSupplyModel;
import com.SmartCity.Bhopal1Click.service.EnergyGasSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EnergyGasSupplyController {

    @Autowired
    private EnergyGasSupplyService service;

    @GetMapping("/gassupply")
    public String viewGasSupplies(Model model) {
        List<EnergyGasSupplyModel> gasSupplies = service.getAllGasSupplies();
        model.addAttribute("gasSupplies", gasSupplies);
        return "gassupply";
    }
}
