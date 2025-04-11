package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.EmergencyCallLogModel;
import com.SmartCity.Bhopal1Click.service.EmergencyCallLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EmergencyCallLogController {
    
    @Autowired
    private EmergencyCallLogService emergencyCallLogService;

    @GetMapping("/emergencycalllogs")
    public String getEmergencyCallLogs(Model model) {
        List<EmergencyCallLogModel> callLogs = emergencyCallLogService.getAllCallLogs();
        model.addAttribute("callLogs", callLogs);
        return "emergencycalllogs";  // This should match your Thymeleaf template file name
    }
}
