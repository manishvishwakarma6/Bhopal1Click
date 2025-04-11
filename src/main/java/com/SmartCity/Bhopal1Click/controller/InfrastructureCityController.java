package com.SmartCity.Bhopal1Click.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SmartCity.Bhopal1Click.model.InfrastuctureCityModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureCityService;

import java.util.List;

@Controller
public class InfrastructureCityController {
	
	    @Autowired
	    private InfrastructureCityService infrastructurecityservice;

	    @GetMapping("/infrastructurecity")
	    public String viewInfrastructurePage(Model model) {
	        List<InfrastuctureCityModel> infrastructureCityList = infrastructurecityservice.getAllInfrastructureCity();
	        model.addAttribute("infrastructureCityList", infrastructureCityList);
	        return "infrastructurecity";
	    }
	}
