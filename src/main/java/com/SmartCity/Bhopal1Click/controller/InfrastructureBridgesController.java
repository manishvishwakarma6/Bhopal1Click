package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureBridgesModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureBridgesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureBridgesController {

    @Autowired
    private InfrastructureBridgesService infrastructureBridgesService;

    @GetMapping("/infrastructurebridges")
    public String showInfrastructureBridges(Model model) {
        List<InfrastructureBridgesModel> bridges = infrastructureBridgesService.getAllBridges();
        model.addAttribute("bridges", bridges);
        return "infrastructurebridges"; // Name of the Thymeleaf template
    }
}
