package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.WastageServiceModel;
import com.SmartCity.Bhopal1Click.service.WastageServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WastageServiceController {

    @Autowired
    private WastageServiceService service;

    @GetMapping("/wastageservice")
    public String showWastageServices(Model model) {
        List<WastageServiceModel> wastageServices = service.getAllWastageServices();
        model.addAttribute("wastageServices", wastageServices);
        return "wastageservice"; // This maps to wastage-services.html
    }
}
