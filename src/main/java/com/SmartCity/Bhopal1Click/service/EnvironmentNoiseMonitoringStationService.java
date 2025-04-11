package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnvironmentNoiseMonitoringStationModel;
import com.SmartCity.Bhopal1Click.repository.EnvironmentNoiseMonitoringStationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnvironmentNoiseMonitoringStationService {

    private final EnvironmentNoiseMonitoringStationRepository repository;

    public EnvironmentNoiseMonitoringStationService(EnvironmentNoiseMonitoringStationRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentNoiseMonitoringStationModel> getAllNoiseMonitoringStations() {
        return repository.findAll();
    }
}
