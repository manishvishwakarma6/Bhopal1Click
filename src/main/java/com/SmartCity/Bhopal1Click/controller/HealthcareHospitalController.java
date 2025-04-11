package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.HealthcareHospitalModel;
import com.SmartCity.Bhopal1Click.service.HealthcareHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HealthcareHospitalController {

    @Autowired
    private HealthcareHospitalService service;

    @GetMapping("/hospitals")
    public String showHospitals(Model model) {
        List<HealthcareHospitalModel> hospitals = service.getAllHospitals();
        model.addAttribute("hospitals", hospitals);
        return "hospitals";  // This is the Thymeleaf template name (hospitals.html)
    }
}
