package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureParkingModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureParkingController {

    @Autowired
    private InfrastructureParkingService parkingService;

    @GetMapping("/infrastructureparkinglots")
    public String showInfrastructureParkingLots(Model model) {
        List<InfrastructureParkingModel> parkingLots = parkingService.getAllParkingLots();
        model.addAttribute("parkingLots", parkingLots);
        return "infrastructureparkinglots";
    }
}
