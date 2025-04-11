package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.TransportAirportsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportAirportsRepository extends JpaRepository<TransportAirportsModel, Integer> {
}
