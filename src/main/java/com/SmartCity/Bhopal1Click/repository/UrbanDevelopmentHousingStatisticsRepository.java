package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentHousingStatisticsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrbanDevelopmentHousingStatisticsRepository extends JpaRepository<UrbanDevelopmentHousingStatisticsModel, Integer> {
}
