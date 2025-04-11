package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.EducationCourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationCourseRepository extends JpaRepository<EducationCourseModel, Integer> {
}
