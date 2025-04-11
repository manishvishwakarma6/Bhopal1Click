package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TransportRailwayStationModel;
import com.SmartCity.Bhopal1Click.repository.TransportRailwayStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportRailwayStationService {

    @Autowired
    private TransportRailwayStationRepository repository;

    public List<TransportRailwayStationModel> getAllRailwayStations() {
        return repository.findAll();
    }
}
