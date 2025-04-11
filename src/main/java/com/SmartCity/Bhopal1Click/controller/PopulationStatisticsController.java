package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PopulationStatisticsModel;
import com.SmartCity.Bhopal1Click.service.PopulationStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PopulationStatisticsController {

    @Autowired
    private PopulationStatisticsService service;

    @GetMapping("/populationstatistics")
    public String showPopulationStatistics(Model model) {
        List<PopulationStatisticsModel> statistics = service.getAllPopulationStatistics();
        model.addAttribute("statistics", statistics);
        return "populationstatistics"; // This maps to population-statistics.html
    }
}
