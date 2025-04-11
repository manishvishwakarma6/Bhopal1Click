package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureDrainageModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureDrainageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureDrainageController {

    @Autowired
    private InfrastructureDrainageService drainageService;

    @GetMapping("/infrastructuredrainagesystems")
    public String showInfrastructureDrainageSystems(Model model) {
        List<InfrastructureDrainageModel> drainages = drainageService.getAllDrainageSystems();
        model.addAttribute("drainages", drainages);
        return "infrastructuredrainagesystems";
    }
}
