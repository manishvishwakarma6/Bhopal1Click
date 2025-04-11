package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.PublicSafetySecurityCameraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicSafetySecurityCameraRepository extends JpaRepository<PublicSafetySecurityCameraModel, Integer> {
}
