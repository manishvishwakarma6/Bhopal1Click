package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.InfrastructureMuseumsModel;
import com.SmartCity.Bhopal1Click.service.InfrastructureMuseumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class InfrastructureMuseumsController {

    @Autowired
    private InfrastructureMuseumsService museumsService;

    @GetMapping("/infrastructuremuseums")
    public String showInfrastructureMuseums(Model model) {
        List<InfrastructureMuseumsModel> museums = museumsService.getAllMuseums();
        model.addAttribute("museums", museums);
        return "infrastructuremuseums";
    }
}
