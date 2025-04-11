package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.GovernmentPoliciesModel;
import com.SmartCity.Bhopal1Click.service.GovernmentPoliciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GovernmentPoliciesController {

    @Autowired
    private GovernmentPoliciesService service;

    @GetMapping("/govtpolicies")
    public String showPolicies(Model model) {
        List<GovernmentPoliciesModel> policies = service.getAllPolicies();
        model.addAttribute("policies", policies);
        return "govtpolicies";
    }
}
