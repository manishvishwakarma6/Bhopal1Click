package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EmergencyContactsModel;
import com.SmartCity.Bhopal1Click.repository.EmergencyContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyContactsService {

    @Autowired
    private EmergencyContactsRepository repository;

    public List<EmergencyContactsModel> getAllEmergencyContacts() {
        return repository.findAll();
    }
}
