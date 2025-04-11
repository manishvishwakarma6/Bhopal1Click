package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EducationLibraryModel;
import com.SmartCity.Bhopal1Click.repository.EducationLibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationLibraryService {

    @Autowired
    private EducationLibraryRepository repository;

    public List<EducationLibraryModel> getAllLibraries() {
        return repository.findAll();
    }
}
