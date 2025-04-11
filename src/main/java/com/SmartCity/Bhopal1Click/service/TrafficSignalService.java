package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TrafficSignalModel;
import com.SmartCity.Bhopal1Click.repository.TrafficSignalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficSignalService {

    @Autowired
    private TrafficSignalRepository repository;

    public List<TrafficSignalModel> getAllTrafficSignals() {
        return repository.findAll();
    }
}
