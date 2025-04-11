package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructurePublicBuildingsModel;
import com.SmartCity.Bhopal1Click.service.InfrastructurePublicBuildingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructurePublicBuildingsController {

    @Autowired
    private InfrastructurePublicBuildingsService buildingsService;

    @GetMapping("/infrastructurepublicbuildings")
    public String showInfrastructurePublicBuildings(Model model) {
        List<InfrastructurePublicBuildingsModel> buildings = buildingsService.getAllBuildings();
        model.addAttribute("buildings", buildings);
        return "infrastructurepublicbuildings";
    }
}
