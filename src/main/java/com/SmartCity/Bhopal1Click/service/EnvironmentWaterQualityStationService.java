package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnvironmentWaterQualityStationModel;
import com.SmartCity.Bhopal1Click.repository.EnvironmentWaterQualityStationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnvironmentWaterQualityStationService {

    private final EnvironmentWaterQualityStationRepository repository;

    public EnvironmentWaterQualityStationService(EnvironmentWaterQualityStationRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentWaterQualityStationModel> getAllWaterQualityStations() {
        return repository.findAll();
    }
}
