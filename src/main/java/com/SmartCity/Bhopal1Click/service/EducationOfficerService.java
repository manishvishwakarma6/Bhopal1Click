package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationOfficerModel;
import com.SmartCity.Bhopal1Click.repository.EducationOfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationOfficerService {

    @Autowired
    private EducationOfficerRepository repository;

    public List<EducationOfficerModel> getAllOfficers() {
        return repository.findAll();
    }
}
