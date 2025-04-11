package com.SmartCity.Bhopal1Click.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartCity.Bhopal1Click.model.InfrastuctureCityModel;

@Repository
public interface InfrastructureCityRepository extends JpaRepository<InfrastuctureCityModel, Integer> {
}
