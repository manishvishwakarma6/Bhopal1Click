package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnergySolarPlantModel;
import com.SmartCity.Bhopal1Click.repository.EnergySolarPlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergySolarPlantService {

    @Autowired
    private EnergySolarPlantRepository repository;

    public List<EnergySolarPlantModel> getAllSolarPlants() {
        return repository.findAll();
    }
}
