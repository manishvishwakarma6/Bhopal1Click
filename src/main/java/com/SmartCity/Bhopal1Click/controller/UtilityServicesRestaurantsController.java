package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.UtilityServicesRestaurantsModel;
import com.SmartCity.Bhopal1Click.service.UtilityServicesRestaurantsService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UtilityServicesRestaurantsController {

    private final UtilityServicesRestaurantsService service;

    public UtilityServicesRestaurantsController(UtilityServicesRestaurantsService service) {
        this.service = service;
    }

    @GetMapping("/utilityservicerestaurants")
    public String getRestaurants(Model model) {
        List<UtilityServicesRestaurantsModel> restaurants = service.getAllRestaurants();
        model.addAttribute("restaurants", restaurants);
        return "utilityservicerestaurants"; // Thymeleaf template name
    }
}
