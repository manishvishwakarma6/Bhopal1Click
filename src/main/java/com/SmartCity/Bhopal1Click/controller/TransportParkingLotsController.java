package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TransportParkingLotsModel;
import com.SmartCity.Bhopal1Click.service.TransportParkingLotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TransportParkingLotsController {

    @Autowired
    private TransportParkingLotsService service;

    @GetMapping("/parkinglots")
    public String showParkingLots(Model model) {
        List<TransportParkingLotsModel> parkinglot = service.getAllParkingLots();
        model.addAttribute("parkinglot", parkinglot);
        return "parkinglots";
    }
}
