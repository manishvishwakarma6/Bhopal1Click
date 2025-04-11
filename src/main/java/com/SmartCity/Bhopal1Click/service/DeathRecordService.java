package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.DeathRecordModel;
import com.SmartCity.Bhopal1Click.repository.DeathRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeathRecordService {

    @Autowired
    private DeathRecordRepository repository;

    public List<DeathRecordModel> getAllDeathRecords() {
        return repository.findAll();
    }
}
