package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TransportVehicleServicesModel;
import com.SmartCity.Bhopal1Click.repository.TransportVehicleServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransportVehicleServicesService {

    @Autowired
    private TransportVehicleServicesRepository repository;

    public List<TransportVehicleServicesModel> getAllVehicleServices() {
        return repository.findAll();
    }
}
