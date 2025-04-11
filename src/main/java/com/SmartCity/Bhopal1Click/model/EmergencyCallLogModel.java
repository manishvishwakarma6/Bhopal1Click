package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicsafetyemergencycalllogs")
public class EmergencyCallLogModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int calllogid;

    private String calllogtype;
    private String calllogname;
    private Long calllogno;

    // Constructors
    public EmergencyCallLogModel() {
    }

    public EmergencyCallLogModel(int calllogid, String calllogtype, String calllogname, Long calllogno) {
        this.calllogid = calllogid;
        this.calllogtype = calllogtype;
        this.calllogname = calllogname;
        this.calllogno = calllogno;
    }

    // Getters and Setters
    public int getCalllogid() {
        return calllogid;
    }

    public void setCalllogid(int calllogid) {
        this.calllogid = calllogid;
    }

    public String getCalllogtype() {
        return calllogtype;
    }

    public void setCalllogtype(String calllogtype) {
        this.calllogtype = calllogtype;
    }

    public String getCalllogname() {
        return calllogname;
    }

    public void setCalllogname(String calllogname) {
        this.calllogname = calllogname;
    }

    public Long getCalllogno() {
        return calllogno;
    }

    public void setCalllogno(Long calllogno) {
        this.calllogno = calllogno;
    }
}
