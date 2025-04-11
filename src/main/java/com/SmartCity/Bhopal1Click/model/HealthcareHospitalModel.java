package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "healthcarehospital")
public class HealthcareHospitalModel {

    @Id
    @Column(name = "hospitalid")
    private int hospitalid;

    @Column(name = "hospitalname", nullable = false)
    private String hospitalname;

    @Column(name = "hospitalcontactno")
    private Long hospitalcontactno;

    @Column(name = "hospitalzonename", nullable = false)
    private String hospitalzonename;

    // Constructors
    public HealthcareHospitalModel() {
    }

    public HealthcareHospitalModel(int hospitalid, String hospitalname, Long hospitalcontactno, String hospitalzonename) {
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.hospitalcontactno = hospitalcontactno;
        this.hospitalzonename = hospitalzonename;
    }

    // Getters and Setters
    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public Long getHospitalcontactno() {
        return hospitalcontactno;
    }

    public void setHospitalcontactno(Long hospitalcontactno) {
        this.hospitalcontactno = hospitalcontactno;
    }

    public String getHospitalzonename() {
        return hospitalzonename;
    }

    public void setHospitalzonename(String hospitalzonename) {
        this.hospitalzonename = hospitalzonename;
    }
}
