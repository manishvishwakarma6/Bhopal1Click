package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructureStadiumModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureStadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructureStadiumService {

    @Autowired
    private InfrastructureStadiumRepository stadiumRepository;

    public List<InfrastructureStadiumModel> getAllStadiums() {
        return stadiumRepository.findAll();
    }
}
