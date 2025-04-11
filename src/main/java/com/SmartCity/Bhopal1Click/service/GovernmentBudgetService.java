package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.GovernmentBudgetModel;
import com.SmartCity.Bhopal1Click.repository.GovernmentBudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GovernmentBudgetService {

    @Autowired
    private GovernmentBudgetRepository repository;

    public List<GovernmentBudgetModel> getAllBudgets() {
        return repository.findAll();
    }
}
