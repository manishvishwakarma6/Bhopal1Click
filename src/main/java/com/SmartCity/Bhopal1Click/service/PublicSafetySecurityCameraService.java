package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.PublicSafetySecurityCameraModel;
import com.SmartCity.Bhopal1Click.repository.PublicSafetySecurityCameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicSafetySecurityCameraService {

    @Autowired
    private PublicSafetySecurityCameraRepository repository;

    public List<PublicSafetySecurityCameraModel> getAllCameras() {
        return repository.findAll();
    }
}
