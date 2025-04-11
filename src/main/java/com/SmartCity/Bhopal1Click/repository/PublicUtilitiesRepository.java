package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.PublicUtilitiesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicUtilitiesRepository extends JpaRepository<PublicUtilitiesModel, Integer> {
}
