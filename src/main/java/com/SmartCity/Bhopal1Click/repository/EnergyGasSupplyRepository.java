package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnergyGasSupplyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyGasSupplyRepository extends JpaRepository<EnergyGasSupplyModel, Integer> {
}
