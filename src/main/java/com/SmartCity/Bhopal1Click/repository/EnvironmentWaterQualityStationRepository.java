package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnvironmentWaterQualityStationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentWaterQualityStationRepository extends JpaRepository<EnvironmentWaterQualityStationModel, Integer> {
}
