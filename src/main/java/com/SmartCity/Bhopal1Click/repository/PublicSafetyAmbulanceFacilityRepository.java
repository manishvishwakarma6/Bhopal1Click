package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.PublicSafetyAmbulanceFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicSafetyAmbulanceFacilityRepository extends JpaRepository<PublicSafetyAmbulanceFacility, Integer> {
}
