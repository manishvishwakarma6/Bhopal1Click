package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.WastageServiceModel;
import com.SmartCity.Bhopal1Click.repository.WastageServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WastageServiceService {

    @Autowired
    private WastageServiceRepository repository;

    public List<WastageServiceModel> getAllWastageServices() {
        return repository.findAll();
    }
}
