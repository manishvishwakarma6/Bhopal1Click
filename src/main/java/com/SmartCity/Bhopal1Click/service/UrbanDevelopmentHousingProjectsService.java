package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentHousingProjectsModel;
import com.SmartCity.Bhopal1Click.repository.UrbanDevelopmentHousingProjectsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UrbanDevelopmentHousingProjectsService {

    private final UrbanDevelopmentHousingProjectsRepository repository;

    public UrbanDevelopmentHousingProjectsService(UrbanDevelopmentHousingProjectsRepository repository) {
        this.repository = repository;
    }

    public List<UrbanDevelopmentHousingProjectsModel> getAllHousingProjects() {
        return repository.findAll();
    }
}
