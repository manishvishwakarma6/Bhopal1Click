package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.UtilityServicesRestaurantsModel;
import com.SmartCity.Bhopal1Click.repository.UtilityServicesRestaurantsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilityServicesRestaurantsService {

    private final UtilityServicesRestaurantsRepository repository;

    public UtilityServicesRestaurantsService(UtilityServicesRestaurantsRepository repository) {
        this.repository = repository;
    }

    public List<UtilityServicesRestaurantsModel> getAllRestaurants() {
        return repository.findAll();
    }
}
