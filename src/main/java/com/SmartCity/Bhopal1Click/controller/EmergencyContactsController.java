package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EmergencyContactsModel;
import com.SmartCity.Bhopal1Click.service.EmergencyContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmergencyContactsController {

    @Autowired
    private EmergencyContactsService service;

    @GetMapping("/emergencycontacts")
    public String viewEmergencyContacts(Model model) {
        List<EmergencyContactsModel> contacts = service.getAllEmergencyContacts();
        model.addAttribute("contacts", contacts);
        return "emergencycontacts";
    }
}
