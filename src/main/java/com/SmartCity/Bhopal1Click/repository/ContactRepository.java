package com.SmartCity.Bhopal1Click.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartCity.Bhopal1Click.model.ContactModel;

public interface ContactRepository extends JpaRepository<ContactModel,Integer>
{

}
