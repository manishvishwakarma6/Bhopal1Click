package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PublicSafetyAmbulanceFacility;
import com.SmartCity.Bhopal1Click.repository.PublicSafetyAmbulanceFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicSafetyAmbulanceFacilityService {

    @Autowired
    private PublicSafetyAmbulanceFacilityRepository repository;

    public List<PublicSafetyAmbulanceFacility> getAllAmbulanceFacilities() {
        return repository.findAll();
    }
}
