package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructureAuditoriumModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureAuditoriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructureAuditoriumService {

    @Autowired
    private InfrastructureAuditoriumRepository auditoriumRepository;

    public List<InfrastructureAuditoriumModel> getAllAuditoriums() {
        return auditoriumRepository.findAll();
    }
}
