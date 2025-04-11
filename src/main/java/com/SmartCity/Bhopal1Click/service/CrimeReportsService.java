package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.CrimeReportsModel;
import com.SmartCity.Bhopal1Click.repository.CrimeReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CrimeReportsService {

    @Autowired
    private CrimeReportsRepository crimeReportsRepository;

    public List<CrimeReportsModel> getAllCrimeReports() {
        return crimeReportsRepository.findAll();
    }
}
