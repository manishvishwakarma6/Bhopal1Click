package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicsafetyfirestation")
public class PublicSafetyFireStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int firestationcode;

    @Column(nullable = false)
    private String firestationname;

    private Long firestationcontact;

    @Column(nullable = false)
    private String firestationzonename;

    // Constructors
    public PublicSafetyFireStationModel() {
    }

    public PublicSafetyFireStationModel(int firestationcode, String firestationname, Long firestationcontact, String firestationzonename) {
        this.firestationcode = firestationcode;
        this.firestationname = firestationname;
        this.firestationcontact = firestationcontact;
        this.firestationzonename = firestationzonename;
    }

    // Getters and Setters
    public int getFirestationcode() {
        return firestationcode;
    }

    public void setFirestationcode(int firestationcode) {
        this.firestationcode = firestationcode;
    }

    public String getFirestationname() {
        return firestationname;
    }

    public void setFirestationname(String firestationname) {
        this.firestationname = firestationname;
    }

    public Long getFirestationcontact() {
        return firestationcontact;
    }

    public void setFirestationcontact(Long firestationcontact) {
        this.firestationcontact = firestationcontact;
    }

    public String getFirestationzonename() {
        return firestationzonename;
    }

    public void setFirestationzonename(String firestationzonename) {
        this.firestationzonename = firestationzonename;
    }
}
