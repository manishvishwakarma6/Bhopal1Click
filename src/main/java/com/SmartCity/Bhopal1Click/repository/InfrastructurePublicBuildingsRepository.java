package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.InfrastructurePublicBuildingsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfrastructurePublicBuildingsRepository extends JpaRepository<InfrastructurePublicBuildingsModel, Integer> {
}
