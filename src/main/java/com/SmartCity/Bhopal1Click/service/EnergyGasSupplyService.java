package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EnergyGasSupplyModel;
import com.SmartCity.Bhopal1Click.repository.EnergyGasSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyGasSupplyService {

    @Autowired
    private EnergyGasSupplyRepository repository;

    public List<EnergyGasSupplyModel> getAllGasSupplies() {
        return repository.findAll();
    }
}
