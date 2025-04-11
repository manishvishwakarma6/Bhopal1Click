package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.DeathRecordModel;
import com.SmartCity.Bhopal1Click.service.DeathRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DeathRecordController {

    @Autowired
    private DeathRecordService service;

    @GetMapping("/deathrecords")
    public String showDeathRecords(Model model) {
        List<DeathRecordModel> records = service.getAllDeathRecords();
        model.addAttribute("records", records);
        return "deathrecords"; // This maps to death-records.html
    }
}
