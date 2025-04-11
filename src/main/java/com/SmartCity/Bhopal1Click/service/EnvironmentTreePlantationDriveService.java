package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnvironmentTreePlantationDriveModel;
import com.SmartCity.Bhopal1Click.repository.EnvironmentTreePlantationDriveRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnvironmentTreePlantationDriveService {

    private final EnvironmentTreePlantationDriveRepository repository;

    public EnvironmentTreePlantationDriveService(EnvironmentTreePlantationDriveRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentTreePlantationDriveModel> getAllTreePlantationDrives() {
        return repository.findAll();
    }
}
