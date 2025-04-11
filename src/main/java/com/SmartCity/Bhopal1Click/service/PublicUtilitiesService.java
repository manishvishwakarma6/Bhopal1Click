package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PublicUtilitiesModel;
import com.SmartCity.Bhopal1Click.repository.PublicUtilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicUtilitiesService {

    @Autowired
    private PublicUtilitiesRepository repository;

    public List<PublicUtilitiesModel> getAllPublicUtilities() {
        return repository.findAll();
    }
}
