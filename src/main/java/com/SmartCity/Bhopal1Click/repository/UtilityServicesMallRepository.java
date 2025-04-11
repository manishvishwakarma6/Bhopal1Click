package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.UtilityServicesMallModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityServicesMallRepository extends JpaRepository<UtilityServicesMallModel, Integer> {
}
