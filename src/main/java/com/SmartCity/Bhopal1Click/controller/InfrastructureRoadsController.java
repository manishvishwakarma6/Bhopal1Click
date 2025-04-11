package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureRoadsModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureRoadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureRoadsController {

    @Autowired
    private InfrastructureRoadsService infrastructureroadsservice;

    @GetMapping("/infrastructureroads")
    public String showInfrastructureRoads(Model model) {
        List<InfrastructureRoadsModel> roads= infrastructureroadsservice.getAllRoads();
        model.addAttribute("roads", roads);
        return "infrastructureroads";
    }
}
