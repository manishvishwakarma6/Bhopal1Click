package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.InfrastructureBridgesModel;
import com.SmartCity.Bhopal1Click.repository.InfrastructureBridgesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InfrastructureBridgesService {

    @Autowired
    private InfrastructureBridgesRepository repository;

    public List<InfrastructureBridgesModel> getAllBridges() {
        return repository.findAll();
    }
}
