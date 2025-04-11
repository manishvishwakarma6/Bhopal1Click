package com.SmartCity.Bhopal1Click.controller;

import com.SmartCity.Bhopal1Click.model.PlayerModel;
import com.SmartCity.Bhopal1Click.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService service;

    @GetMapping("/gameplayers")
    public String showPlayers(Model model) {
        List<PlayerModel> players = service.getAllPlayers();
        model.addAttribute("players", players);
        return "gameplayers";
    }
}
