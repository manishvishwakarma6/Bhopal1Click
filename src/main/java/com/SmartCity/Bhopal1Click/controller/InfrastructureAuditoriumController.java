package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureAuditoriumModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureAuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureAuditoriumController {

    @Autowired
    private InfrastructureAuditoriumService auditoriumService;

    @GetMapping("/infrastructureauditoriums")
    public String showInfrastructureAuditoriums(Model model) {
        List<InfrastructureAuditoriumModel> auditoriums = auditoriumService.getAllAuditoriums();
        model.addAttribute("auditoriums", auditoriums);
        return "infrastructureauditoriums";
    }
}
