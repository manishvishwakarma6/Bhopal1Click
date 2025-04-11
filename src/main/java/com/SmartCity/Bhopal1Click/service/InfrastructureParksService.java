package com.SmartCity.Bhopal1Click.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartCity.Bhopal1Click.model.InfrastructureParksModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureParksRepository;

import java.util.List;

@Service
public class InfrastructureParksService {

    @Autowired
    private InfrastructureParksRepository repository;

    public List<InfrastructureParksModel> getAllParks() {
        return repository.findAll();
    }
}
