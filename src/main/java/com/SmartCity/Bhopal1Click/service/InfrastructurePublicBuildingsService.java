package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructurePublicBuildingsModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructurePublicBuildingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructurePublicBuildingsService {

    @Autowired
    private InfrastructurePublicBuildingsRepository buildingsRepository;

    public List<InfrastructurePublicBuildingsModel> getAllBuildings() {
        return buildingsRepository.findAll();
    }
}
