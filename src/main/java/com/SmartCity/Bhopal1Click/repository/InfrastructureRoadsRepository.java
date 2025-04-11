package com.SmartCity.Bhopal1Click.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartCity.Bhopal1Click.model.InfrastructureRoadsModel;

@Repository
public interface InfrastructureRoadsRepository extends JpaRepository<InfrastructureRoadsModel, Integer> {
}
