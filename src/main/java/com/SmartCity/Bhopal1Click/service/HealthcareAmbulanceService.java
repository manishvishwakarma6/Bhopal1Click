package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.HealthcareAmbulanceModel;
import com.SmartCity.Bhopal1Click.repository.HealthcareAmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthcareAmbulanceService {

    @Autowired
    private HealthcareAmbulanceRepository repository;

    public List<HealthcareAmbulanceModel> getAllAmbulances() {
        return repository.findAll();
    }
}
