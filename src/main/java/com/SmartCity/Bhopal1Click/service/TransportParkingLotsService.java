package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TransportParkingLotsModel;
import com.SmartCity.Bhopal1Click.repository.TransportParkingLotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransportParkingLotsService {

    @Autowired
    private TransportParkingLotsRepository repository;

    public List<TransportParkingLotsModel> getAllParkingLots() {
        return repository.findAll();
    }
}
