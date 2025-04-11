package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentHousingStatisticsModel;
import com.SmartCity.Bhopal1Click.service.UrbanDevelopmentHousingStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UrbanDevelopmentHousingStatisticsController {

    @Autowired
    private UrbanDevelopmentHousingStatisticsService service;

    @GetMapping("/urbandevelopmenthousingstatistics")
    public String viewHousingStatistics(Model model) {
        List<UrbanDevelopmentHousingStatisticsModel> statistics = service.getAllHousingStatistics();
        model.addAttribute("statistics", statistics);
        return "urbandevelopmenthousingstatistics";
    }
}
