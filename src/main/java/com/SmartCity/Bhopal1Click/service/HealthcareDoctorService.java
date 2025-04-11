package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.HealthcareDoctorModel;
import com.SmartCity.Bhopal1Click.repository.HealthcareDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HealthcareDoctorService {

    @Autowired
    private HealthcareDoctorRepository repository;

    public List<HealthcareDoctorModel> getAllDoctors() {
        return repository.findAll();
    }
}
