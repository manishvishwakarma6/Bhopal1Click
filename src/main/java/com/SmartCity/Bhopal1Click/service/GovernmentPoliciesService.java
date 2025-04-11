package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.GovernmentPoliciesModel;
import com.SmartCity.Bhopal1Click.repository.GovernmentPoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GovernmentPoliciesService {

    @Autowired
    private GovernmentPoliciesRepository repository;

    public List<GovernmentPoliciesModel> getAllPolicies() {
        return repository.findAll();
    }
}
