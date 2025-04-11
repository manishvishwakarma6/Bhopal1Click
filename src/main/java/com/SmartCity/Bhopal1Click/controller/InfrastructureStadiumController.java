package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureStadiumModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureStadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureStadiumController {

    @Autowired
    private InfrastructureStadiumService stadiumService;

    @GetMapping("/infrastructurestadiums")
    public String showInfrastructureStadiums(Model model) {
        List<InfrastructureStadiumModel> stadiums = stadiumService.getAllStadiums();
        model.addAttribute("stadiums", stadiums);
        return "infrastructurestadiums";
    }
}
