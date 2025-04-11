package com.SmartCity.Bhopal1Click.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartCity.Bhopal1Click.model.InfrastructureRoadsModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureRoadsRepository;

import java.util.List;

@Service
public class InfrastructureRoadsService {

    @Autowired
    private InfrastructureRoadsRepository repository;

    public List<InfrastructureRoadsModel> getAllRoads() {
        return repository.findAll();
    }
}
