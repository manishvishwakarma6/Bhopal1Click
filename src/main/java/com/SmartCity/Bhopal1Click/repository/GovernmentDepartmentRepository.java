package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.GovernmentDepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GovernmentDepartmentRepository extends JpaRepository<GovernmentDepartmentModel, Integer> {
}
