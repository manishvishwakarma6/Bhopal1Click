package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PublicSafetySecurityCameraModel;
import com.SmartCity.Bhopal1Click.service.PublicSafetySecurityCameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PublicSafetySecurityCameraController {

    @Autowired
    private PublicSafetySecurityCameraService service;

    @GetMapping("/securitycameras")
    public String getCameras(Model model) {
        List<PublicSafetySecurityCameraModel> cameras = service.getAllCameras();
        model.addAttribute("cameras", cameras);
        return "securitycameras";
    }
}
