package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationDepartmentModel;
import com.SmartCity.Bhopal1Click.repository.EducationDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDepartmentService {

    @Autowired
    private EducationDepartmentRepository repository;

    public List<EducationDepartmentModel> getAllDepartments() {
        return repository.findAll();
    }
}
