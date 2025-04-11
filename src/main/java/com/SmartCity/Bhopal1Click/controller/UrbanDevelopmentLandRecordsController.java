package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentLandRecordsModel;
import com.SmartCity.Bhopal1Click.service.UrbanDevelopmentLandRecordsService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UrbanDevelopmentLandRecordsController {

    private final UrbanDevelopmentLandRecordsService service;

    public UrbanDevelopmentLandRecordsController(UrbanDevelopmentLandRecordsService service) {
        this.service = service;
    }

    @GetMapping("/urbandevelopmentlandrecords")
    public String getLandRecords(Model model) {
        List<UrbanDevelopmentLandRecordsModel> landRecords = service.getAllLandRecords();
        model.addAttribute("landRecords", landRecords);
        return "urbandevelopmentlandrecords"; // Thymeleaf template name
    }
}
