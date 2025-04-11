package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.PopulationStatisticsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopulationStatisticsRepository extends JpaRepository<PopulationStatisticsModel, Integer> {
}
