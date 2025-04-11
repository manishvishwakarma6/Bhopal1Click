package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.HealthcareHospitalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthcareHospitalRepository extends JpaRepository<HealthcareHospitalModel, Integer> {
}
