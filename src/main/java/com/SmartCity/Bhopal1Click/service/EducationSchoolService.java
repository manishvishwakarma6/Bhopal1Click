package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationSchoolModel;
import com.SmartCity.Bhopal1Click.repository.EducationSchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationSchoolService {

    @Autowired
    private EducationSchoolRepository repository;

    public List<EducationSchoolModel> getAllSchools() {
        return repository.findAll();
    }
}
