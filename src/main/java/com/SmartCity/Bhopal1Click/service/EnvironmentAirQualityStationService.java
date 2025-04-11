package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnvironmentAirQualityStationModel;
import com.SmartCity.Bhopal1Click.repository.EnvironmentAirQualityStationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnvironmentAirQualityStationService {

    private final EnvironmentAirQualityStationRepository repository;

    public EnvironmentAirQualityStationService(EnvironmentAirQualityStationRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentAirQualityStationModel> getAllAirQualityStations() {
        return repository.findAll();
    }
}
