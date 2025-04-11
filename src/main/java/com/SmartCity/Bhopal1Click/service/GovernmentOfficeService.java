package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.GovernmentOfficeModel;
import com.SmartCity.Bhopal1Click.repository.GovernmentOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GovernmentOfficeService {

    @Autowired
    private GovernmentOfficeRepository repository;

    public List<GovernmentOfficeModel> getAllGovernmentOffices() {
        return repository.findAll();
    }
}
