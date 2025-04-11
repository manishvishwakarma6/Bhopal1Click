package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructureMuseumsModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureMuseumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructureMuseumsService {

    @Autowired
    private InfrastructureMuseumsRepository museumsRepository;

    public List<InfrastructureMuseumsModel> getAllMuseums() {
        return museumsRepository.findAll();
    }
}
