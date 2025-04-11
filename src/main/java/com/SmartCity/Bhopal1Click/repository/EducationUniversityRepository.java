package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EducationUniversityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationUniversityRepository extends JpaRepository<EducationUniversityModel, Integer> {
}
