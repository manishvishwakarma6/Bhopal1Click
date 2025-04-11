package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.TouristPlaceModel;
import com.SmartCity.Bhopal1Click.service.TouristPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TouristPlaceController {

    @Autowired
    private TouristPlaceService service;

    @GetMapping("/touristplaces")
    public String showTouristPlaces(Model model) {
        List<TouristPlaceModel> touristPlaces = service.getAllTouristPlaces();
        model.addAttribute("touristPlaces", touristPlaces);
        return "touristplaces";
    }
}
