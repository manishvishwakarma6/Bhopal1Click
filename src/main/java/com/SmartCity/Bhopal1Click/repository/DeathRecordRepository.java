package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.DeathRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeathRecordRepository extends JpaRepository<DeathRecordModel, Integer> {
}
