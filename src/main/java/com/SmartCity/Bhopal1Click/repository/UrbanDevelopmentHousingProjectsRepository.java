package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.UrbanDevelopmentHousingProjectsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrbanDevelopmentHousingProjectsRepository extends JpaRepository<UrbanDevelopmentHousingProjectsModel, Integer> {
}
