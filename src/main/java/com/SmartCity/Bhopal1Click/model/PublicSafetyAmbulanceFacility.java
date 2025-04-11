package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicsafetyambulancefacility")
public class PublicSafetyAmbulanceFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ambulanceregistrationno")
    private int ambulanceregistrationno;

    @Column(name = "ambulancetype", nullable = false)
    private String ambulancetype;

    @Column(name = "ambulanceservicename", nullable = false)
    private String ambulanceservicename;

    @Column(name = "ambulancezonename", nullable = false)
    private String ambulancezonename;

    // Constructors
    public PublicSafetyAmbulanceFacility() {}

    public PublicSafetyAmbulanceFacility(int ambulanceregistrationno, String ambulancetype, String ambulanceservicename, String ambulancezonename) {
        this.ambulanceregistrationno = ambulanceregistrationno;
        this.ambulancetype = ambulancetype;
        this.ambulanceservicename = ambulanceservicename;
        this.ambulancezonename = ambulancezonename;
    }

    // Getters and Setters
    public int getAmbulanceregistrationno() {
        return ambulanceregistrationno;
    }

    public void setAmbulanceregistrationno(int ambulanceregistrationno) {
        this.ambulanceregistrationno = ambulanceregistrationno;
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
