package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.InfrastructureStadiumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfrastructureStadiumRepository extends JpaRepository<InfrastructureStadiumModel, Integer> {
}
