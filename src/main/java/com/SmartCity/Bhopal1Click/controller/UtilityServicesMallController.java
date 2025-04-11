package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UtilityServicesMallModel;
import com.SmartCity.Bhopal1Click.service.UtilityServicesMallService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UtilityServicesMallController {

    private final UtilityServicesMallService service;

    public UtilityServicesMallController(UtilityServicesMallService service) {
        this.service = service;
    }

    @GetMapping("/utilityservicemalls")
    public String getMalls(Model model) {
        List<UtilityServicesMallModel> malls = service.getAllMalls();
        model.addAttribute("malls", malls);
        return "utilityservicemalls"; // Thymeleaf template name
    }
}
