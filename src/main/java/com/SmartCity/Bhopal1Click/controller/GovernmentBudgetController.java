package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.GovernmentBudgetModel;
import com.SmartCity.Bhopal1Click.service.GovernmentBudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GovernmentBudgetController {

    @Autowired
    private GovernmentBudgetService service;

    @GetMapping("/govtbudgets")
    public String showBudgets(Model model) {
        List<GovernmentBudgetModel> budgets = service.getAllBudgets();
        model.addAttribute("budgets", budgets);
        return "govtbudgets";
    }
}
