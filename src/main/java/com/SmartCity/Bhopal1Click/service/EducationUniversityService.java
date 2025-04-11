package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationUniversityModel;
import com.SmartCity.Bhopal1Click.repository.EducationUniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationUniversityService {

    @Autowired
    private EducationUniversityRepository repository;

    public List<EducationUniversityModel> getAllUniversities() {
        return repository.findAll();
    }
}
