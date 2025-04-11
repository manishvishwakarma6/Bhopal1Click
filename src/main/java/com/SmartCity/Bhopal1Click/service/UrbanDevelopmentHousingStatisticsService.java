package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentHousingStatisticsModel;
import com.SmartCity.Bhopal1Click.repository.UrbanDevelopmentHousingStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrbanDevelopmentHousingStatisticsService {

    @Autowired
    private UrbanDevelopmentHousingStatisticsRepository repository;

    public List<UrbanDevelopmentHousingStatisticsModel> getAllHousingStatistics() {
        return repository.findAll();
    }
}
