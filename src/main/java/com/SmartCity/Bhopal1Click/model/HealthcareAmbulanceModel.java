package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "healthcareambulance")
public class HealthcareAmbulanceModel {

    @Id
    @Column(name = "ambulanceregistraionno")
    private int ambulanceregistraionno;

    @Column(name = "ambulancetype", nullable = false)
    private String ambulancetype;

    @Column(name = "ambulanceservicename", nullable = false)
    private String ambulanceservicename;

    @Column(name = "ambulancezonename", nullable = false)
    private String ambulancezonename;

    // Constructors
    public HealthcareAmbulanceModel() {
    }

    public HealthcareAmbulanceModel(int ambulanceregistraionno, String ambulancetype, String ambulanceservicename, String ambulancezonename) {
        this.ambulanceregistraionno = ambulanceregistraionno;
        this.ambulancetype = ambulancetype;
        this.ambulanceservicename = ambulanceservicename;
        this.ambulancezonename = ambulancezonename;
    }

    // Getters and Setters
    public int getAmbulanceregistraionno() {
        return ambulanceregistraionno;
    }

    public void setAmbulanceregistraionno(int ambulanceregistraionno) {
        this.ambulanceregistraionno = ambulanceregistraionno;
    }

    public String getAmbulancetype() {
        return ambulancetype;
    }

    public void setAmbulancetype(String ambulancetype) {
        this.ambulancetype = ambulancetype;
    }

    public String getAmbulanceservicename() {
        return ambulanceservicename;
    }

    public void setAmbulanceservicename(String ambulanceservicename) {
        this.ambulanceservicename = ambulanceservicename;
    }

    public String getAmbulancezonename() {
        return ambulancezonename;
    }

    public void setAmbulancezonename(String ambulancezonename) {
        this.ambulancezonename = ambulancezonename;
    }
}
