package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.HealthcareAmbulanceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthcareAmbulanceRepository extends JpaRepository<HealthcareAmbulanceModel, Integer> {
}
