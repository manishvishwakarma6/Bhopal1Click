package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.TrafficSignalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficSignalRepository extends JpaRepository<TrafficSignalModel, Integer> {
}
