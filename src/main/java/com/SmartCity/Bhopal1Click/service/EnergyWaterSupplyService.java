package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnergyWaterSupplyModel;
import com.SmartCity.Bhopal1Click.repository.EnergyWaterSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyWaterSupplyService {

    @Autowired
    private EnergyWaterSupplyRepository repository;

    public List<EnergyWaterSupplyModel> getAllWaterSupplies() {
        return repository.findAll();
    }
}
