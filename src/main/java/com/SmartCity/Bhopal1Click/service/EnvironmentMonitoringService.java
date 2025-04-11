package com.SmartCity.Bhopal1Click.service;
import org.springframework.stereotype.Service;

import com.SmartCity.Bhopal1Click.model.EnvironmentMonitoringModel;
import com.SmartCity.Bhopal1Click.repository.EnvironmentMonitoringRepository;

import java.util.List;

@Service
public class EnvironmentMonitoringService {

    private final EnvironmentMonitoringRepository repository;

    public EnvironmentMonitoringService(EnvironmentMonitoringRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentMonitoringModel> getAllEnvironmentData() {
        return repository.findAll();
    }
}
