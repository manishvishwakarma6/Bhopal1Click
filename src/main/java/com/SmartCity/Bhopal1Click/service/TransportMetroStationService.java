package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TransportMetroStationModel;
import com.SmartCity.Bhopal1Click.repository.TransportMetroStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportMetroStationService {

    @Autowired
    private TransportMetroStationRepository repository;

    public List<TransportMetroStationModel> getAllMetroStations() {
        return repository.findAll();
    }
}
