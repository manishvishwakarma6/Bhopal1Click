package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.TouristPlaceModel;
import com.SmartCity.Bhopal1Click.repository.TouristPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristPlaceService {

    @Autowired
    private TouristPlaceRepository repository;

    public List<TouristPlaceModel> getAllTouristPlaces() {
        return repository.findAll();
    }
}
