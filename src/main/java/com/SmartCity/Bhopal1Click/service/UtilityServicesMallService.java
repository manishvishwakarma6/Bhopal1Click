package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UtilityServicesMallModel;
import com.SmartCity.Bhopal1Click.repository.UtilityServicesMallRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilityServicesMallService {

    private final UtilityServicesMallRepository repository;

    public UtilityServicesMallService(UtilityServicesMallRepository repository) {
        this.repository = repository;
    }

    public List<UtilityServicesMallModel> getAllMalls() {
        return repository.findAll();
    }
}
