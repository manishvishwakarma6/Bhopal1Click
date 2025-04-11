package com.SmartCity.Bhopal1Click.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartCity.Bhopal1Click.model.InfrastuctureCityModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureCityRepository;

import java.util.List;

@Service
public class InfrastructureCityService {
	
	    @Autowired
	    private InfrastructureCityRepository repository;

	    public List<InfrastuctureCityModel> getAllInfrastructureCity() {
	        return repository.findAll();
	    }
	}
