package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructureParkingModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructureParkingService {

    @Autowired
    private InfrastructureParkingRepository parkingRepository;

    public List<InfrastructureParkingModel> getAllParkingLots() {
        return parkingRepository.findAll();
    }
}
