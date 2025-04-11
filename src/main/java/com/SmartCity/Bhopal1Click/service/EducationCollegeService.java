package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationCollegeModel;
import com.SmartCity.Bhopal1Click.repository.EducationCollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationCollegeService {

    @Autowired
    private EducationCollegeRepository repository;

    public List<EducationCollegeModel> getAllColleges() {
        return repository.findAll();
    }
}
