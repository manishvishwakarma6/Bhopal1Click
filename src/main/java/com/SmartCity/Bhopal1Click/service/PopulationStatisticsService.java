package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PopulationStatisticsModel;
import com.SmartCity.Bhopal1Click.repository.PopulationStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopulationStatisticsService {

    @Autowired
    private PopulationStatisticsRepository repository;

    public List<PopulationStatisticsModel> getAllPopulationStatistics() {
        return repository.findAll();
    }
}
