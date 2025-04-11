package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.PublicSafetyFireStationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicSafetyFireStationRepository extends JpaRepository<PublicSafetyFireStationModel, Integer> {
}
