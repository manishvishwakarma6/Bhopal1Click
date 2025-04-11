package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EducationSchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationSchoolRepository extends JpaRepository<EducationSchoolModel, Integer> {
}
