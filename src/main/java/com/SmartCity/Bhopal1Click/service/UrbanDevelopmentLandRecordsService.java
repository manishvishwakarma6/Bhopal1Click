package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentLandRecordsModel;
import com.SmartCity.Bhopal1Click.repository.UrbanDevelopmentLandRecordsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UrbanDevelopmentLandRecordsService {

    private final UrbanDevelopmentLandRecordsRepository repository;

    public UrbanDevelopmentLandRecordsService(UrbanDevelopmentLandRecordsRepository repository) {
        this.repository = repository;
    }

    public List<UrbanDevelopmentLandRecordsModel> getAllLandRecords() {
        return repository.findAll();
    }
}
