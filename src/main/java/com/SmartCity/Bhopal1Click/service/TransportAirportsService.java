package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TransportAirportsModel;
import com.SmartCity.Bhopal1Click.repository.TransportAirportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportAirportsService {

    @Autowired
    private TransportAirportsRepository repository;

    public List<TransportAirportsModel> getAllAirports() {
        return repository.findAll();
    }
}
