package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationCourseModel;
import com.SmartCity.Bhopal1Click.repository.EducationCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationCourseService {

    @Autowired
    private EducationCourseRepository repository;

    public List<EducationCourseModel> getAllCourses() {
        return repository.findAll();
    }
}
