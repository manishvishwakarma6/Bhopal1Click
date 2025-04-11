package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.GovernmentDepartmentModel;
import com.SmartCity.Bhopal1Click.repository.GovernmentDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GovernmentDepartmentService {

    @Autowired
    private GovernmentDepartmentRepository repository;

    public List<GovernmentDepartmentModel> getAllDepartments() {
        return repository.findAll();
    }
}
