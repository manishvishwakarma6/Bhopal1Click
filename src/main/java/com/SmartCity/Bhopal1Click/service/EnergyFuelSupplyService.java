package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnergyFuelSupplyModel;
import com.SmartCity.Bhopal1Click.repository.EnergyFuelSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyFuelSupplyService {

    @Autowired
    private EnergyFuelSupplyRepository repository;

    public List<EnergyFuelSupplyModel> getAllFuelSupplies() {
        return repository.findAll();
    }
}
