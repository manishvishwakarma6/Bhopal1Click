package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.InfrastructureAuditoriumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfrastructureAuditoriumRepository extends JpaRepository<InfrastructureAuditoriumModel, Integer> {
}
