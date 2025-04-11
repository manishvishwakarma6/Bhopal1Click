package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.WastageServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WastageServiceRepository extends JpaRepository<WastageServiceModel, Integer> {
}
