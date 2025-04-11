package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnergyFuelSupplyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyFuelSupplyRepository extends JpaRepository<EnergyFuelSupplyModel, Integer> {
}
