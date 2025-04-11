package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UtilityServicesElectronicsModel;
import com.SmartCity.Bhopal1Click.repository.UtilityServicesElectronicsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilityServicesElectronicsService {

    private final UtilityServicesElectronicsRepository repository;

    public UtilityServicesElectronicsService(UtilityServicesElectronicsRepository repository) {
        this.repository = repository;
    }

    public List<UtilityServicesElectronicsModel> getAllElectronicShops() {
        return repository.findAll();
    }
}
