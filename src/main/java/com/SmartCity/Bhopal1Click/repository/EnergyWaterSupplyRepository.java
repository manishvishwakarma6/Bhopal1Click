package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnergyWaterSupplyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyWaterSupplyRepository extends JpaRepository<EnergyWaterSupplyModel, Integer> {
}
