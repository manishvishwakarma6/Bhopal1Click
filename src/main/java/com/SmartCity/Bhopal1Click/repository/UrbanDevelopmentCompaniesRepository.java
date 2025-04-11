package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentCompaniesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrbanDevelopmentCompaniesRepository extends JpaRepository<UrbanDevelopmentCompaniesModel, Integer> {
}
