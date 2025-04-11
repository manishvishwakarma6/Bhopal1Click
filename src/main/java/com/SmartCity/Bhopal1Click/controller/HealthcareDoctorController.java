package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.HealthcareDoctorModel;
import com.SmartCity.Bhopal1Click.service.HealthcareDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HealthcareDoctorController {

    @Autowired
    private HealthcareDoctorService doctorService;

    @GetMapping("/healthcaredoctors")
    public String showDoctors(Model model) {
        List<HealthcareDoctorModel> doctors = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);
        return "healthcaredoctors"; // This will look for doctors.html in templates folder
    }
}
