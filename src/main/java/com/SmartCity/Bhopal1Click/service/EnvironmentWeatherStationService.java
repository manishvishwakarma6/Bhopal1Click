package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnvironmentWeatherStationModel;
import com.SmartCity.Bhopal1Click.repository.EnvironmentWeatherStationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnvironmentWeatherStationService {

    private final EnvironmentWeatherStationRepository repository;

    public EnvironmentWeatherStationService(EnvironmentWeatherStationRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentWeatherStationModel> getAllWeatherStations() {
        return repository.findAll();
    }
}
