package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.GovernmentProjectsModel;
import com.SmartCity.Bhopal1Click.repository.GovernmentProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GovernmentProjectsService {

    @Autowired
    private GovernmentProjectsRepository repository;

    public List<GovernmentProjectsModel> getAllProjects() {
        return repository.findAll();
    }
}
