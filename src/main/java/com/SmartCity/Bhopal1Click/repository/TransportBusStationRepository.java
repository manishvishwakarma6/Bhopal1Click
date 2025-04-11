package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.TransportBusStationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportBusStationRepository extends JpaRepository<TransportBusStationModel, Integer> {
}
