package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnergyElectricitySupplyModel;
import com.SmartCity.Bhopal1Click.repository.EnergyElectricitySupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyElectricitySupplyService {

    @Autowired
    private EnergyElectricitySupplyRepository repository;

    public List<EnergyElectricitySupplyModel> getAllElectricitySupplies() {
        return repository.findAll();
    }
}
