package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EnergySolarPlantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergySolarPlantRepository extends JpaRepository<EnergySolarPlantModel, Integer> {
}
