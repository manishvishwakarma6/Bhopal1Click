package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnvironmentAirQualityStationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentAirQualityStationRepository extends JpaRepository<EnvironmentAirQualityStationModel, Integer> {
}
