package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.InfrastructureParkingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfrastructureParkingRepository extends JpaRepository<InfrastructureParkingModel, Integer> {
}
