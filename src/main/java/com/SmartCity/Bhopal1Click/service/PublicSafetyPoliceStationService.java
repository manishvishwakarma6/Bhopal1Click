package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PublicSafetyPoliceStationModel;
import com.SmartCity.Bhopal1Click.repository.PublicSafetyPoliceStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicSafetyPoliceStationService {

    @Autowired
    private PublicSafetyPoliceStationRepository repository;

    public List<PublicSafetyPoliceStationModel> getAllPoliceStations() {
        return repository.findAll();
    }
}
