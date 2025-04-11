package com.SmartCity.Bhopal1Click.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartCity.Bhopal1Click.model.EnvironmentMonitoringModel;

@Repository
public interface EnvironmentMonitoringRepository extends JpaRepository<EnvironmentMonitoringModel, Integer> {
}
