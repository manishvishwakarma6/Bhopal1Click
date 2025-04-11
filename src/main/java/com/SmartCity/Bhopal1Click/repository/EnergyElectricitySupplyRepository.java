package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnergyElectricitySupplyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyElectricitySupplyRepository extends JpaRepository<EnergyElectricitySupplyModel, Integer> {
}
