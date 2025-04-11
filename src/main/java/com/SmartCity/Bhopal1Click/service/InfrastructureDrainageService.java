package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructureDrainageModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureDrainageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructureDrainageService {

    @Autowired
    private InfrastructureDrainageRepository drainageRepository;

    public List<InfrastructureDrainageModel> getAllDrainageSystems() {
        return drainageRepository.findAll();
    }
}
