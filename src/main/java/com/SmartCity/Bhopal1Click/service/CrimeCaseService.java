package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.CrimeCaseModel;
import com.SmartCity.Bhopal1Click.repository.CrimeCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrimeCaseService {

    @Autowired
    private CrimeCaseRepository crimeCaseRepository;

    public List<CrimeCaseModel> getAllCrimeCases() {
        return crimeCaseRepository.findAll();
    }
}
