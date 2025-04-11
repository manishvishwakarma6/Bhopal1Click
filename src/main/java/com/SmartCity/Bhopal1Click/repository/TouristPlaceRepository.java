package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.TouristPlaceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristPlaceRepository extends JpaRepository<TouristPlaceModel, Integer> {
}
