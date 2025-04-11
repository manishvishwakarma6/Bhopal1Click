package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PublicSafetyFireStationModel;
import com.SmartCity.Bhopal1Click.repository.PublicSafetyFireStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PublicSafetyFireStationService {

    @Autowired
    private PublicSafetyFireStationRepository repository;

    public List<PublicSafetyFireStationModel> getAllFireStations() {
        return repository.findAll();
    }
}
