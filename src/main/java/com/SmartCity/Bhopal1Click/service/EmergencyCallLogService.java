package com.SmartCity.Bhopal1Click.service;

import com.SmartCity.Bhopal1Click.model.EmergencyCallLogModel;
import com.SmartCity.Bhopal1Click.repository.EmergencyCallLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmergencyCallLogService {
    
    @Autowired
    private EmergencyCallLogRepository emergencyCallLogRepository;

    public List<EmergencyCallLogModel> getAllCallLogs() {
        return emergencyCallLogRepository.findAll();
    }
}
