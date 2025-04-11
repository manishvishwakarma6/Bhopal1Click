package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.BirthRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirthRecordRepository extends JpaRepository<BirthRecordModel, Integer> {
}
