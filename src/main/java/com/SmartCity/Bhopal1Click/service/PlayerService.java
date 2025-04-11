package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PlayerModel;
import com.SmartCity.Bhopal1Click.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public List<PlayerModel> getAllPlayers() {
        return repository.findAll();
    }
}
