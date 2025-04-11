package com.SmartCity.Bhopal1Click.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartCity.Bhopal1Click.model.FeedbackModel;

public interface FeedbackRepository extends JpaRepository<FeedbackModel,Integer>
 {

}
