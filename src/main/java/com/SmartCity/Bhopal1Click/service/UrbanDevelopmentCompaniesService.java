package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentCompaniesModel;
import com.SmartCity.Bhopal1Click.repository.UrbanDevelopmentCompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrbanDevelopmentCompaniesService {

    @Autowired
    private UrbanDevelopmentCompaniesRepository repository;

    public List<UrbanDevelopmentCompaniesModel> getAllCompanies() {
        return repository.findAll();
    }
}
