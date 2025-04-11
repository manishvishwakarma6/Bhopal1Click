package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TransportVehicleServicesModel;
import com.SmartCity.Bhopal1Click.service.TransportVehicleServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TransportVehicleServicesController {

    @Autowired
    private TransportVehicleServicesService service;

    @GetMapping("/vehicleservices")
    public String showVehicleServices(Model model) {
        List<TransportVehicleServicesModel> vehicleservice = service.getAllVehicleServices();
        model.addAttribute("vehicleservice", vehicleservice);
        return "vehicleservices";
    }
}
