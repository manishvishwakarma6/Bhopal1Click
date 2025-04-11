package com.SmartCity.Bhopal1Click.repository;

import com.SmartCity.Bhopal1Click.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer> {
}
