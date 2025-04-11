package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.CrimeReportsModel;
import com.SmartCity.Bhopal1Click.service.CrimeReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class CrimeReportsController {

    @Autowired
    private CrimeReportsService crimeReportsService;

    @GetMapping("/crimereports")
    public String showCrimeReports(Model model) {
        List<CrimeReportsModel> crimeReport = crimeReportsService.getAllCrimeReports();
        model.addAttribute("crimeReport", crimeReport);
        return "crimereports";
    }
}
