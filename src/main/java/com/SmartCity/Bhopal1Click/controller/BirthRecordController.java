package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.BirthRecordModel;
import com.SmartCity.Bhopal1Click.service.BirthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BirthRecordController {

    @Autowired
    private BirthRecordService service;

    @GetMapping("/birthrecords")
    public String showBirthRecords(Model model) {
        List<BirthRecordModel> records = service.getAllBirthRecords();
        model.addAttribute("records", records);
        return "birthrecords"; // This maps to birth-records.html
    }
}
