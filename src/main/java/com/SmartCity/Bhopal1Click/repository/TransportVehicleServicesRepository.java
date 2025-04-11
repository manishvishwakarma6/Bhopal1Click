package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.TransportVehicleServicesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportVehicleServicesRepository extends JpaRepository<TransportVehicleServicesModel, Integer> {
}
