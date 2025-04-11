package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.HealthcareHospitalModel;
import com.SmartCity.Bhopal1Click.repository.HealthcareHospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HealthcareHospitalService {

    @Autowired
    private HealthcareHospitalRepository repository;

    public List<HealthcareHospitalModel> getAllHospitals() {
        return repository.findAll();
    }
}
