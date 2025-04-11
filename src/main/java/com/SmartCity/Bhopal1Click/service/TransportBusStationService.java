package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TransportBusStationModel;
import com.SmartCity.Bhopal1Click.repository.TransportBusStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportBusStationService {

    @Autowired
    private TransportBusStationRepository repository;

    public List<TransportBusStationModel> getAllBusStations() {
        return repository.findAll();
    }
}
