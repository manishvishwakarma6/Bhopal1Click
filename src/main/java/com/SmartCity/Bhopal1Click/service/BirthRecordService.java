package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.BirthRecordModel;
import com.SmartCity.Bhopal1Click.repository.BirthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirthRecordService {

    @Autowired
    private BirthRecordRepository repository;

    public List<BirthRecordModel> getAllBirthRecords() {
        return repository.findAll();
    }
}
