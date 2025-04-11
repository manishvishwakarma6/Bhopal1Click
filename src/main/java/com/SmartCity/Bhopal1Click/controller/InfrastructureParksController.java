package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureParksModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureParksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InfrastructureParksController {

    @Autowired
    private InfrastructureParksService service;

    @GetMapping("/infrastructureparks")
    public String showParks(Model model) {
        List<InfrastructureParksModel> parks = service.getAllParks();
        model.addAttribute("parks", parks);
        return "infrastructureparks"; // Refers to parks.html in templates folder
    }
}
