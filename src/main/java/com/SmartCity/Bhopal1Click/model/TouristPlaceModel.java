package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "touristplace")
public class TouristPlaceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int touristsiteid;

    @Column(nullable = false)
    private String touristsitetype;

    @Column(nullable = false)
    private String touristsitename;

    @Column(nullable = false)
    private String touristsitestatus;

    @Column(nullable = false)
    private String touristsitezonename;

    // Getters and Setters
    public int getTouristsiteid() {
        return touristsiteid;
    }

    public void setTouristsiteid(int touristsiteid) {
        this.touristsiteid = touristsiteid;
    }

    public String getTouristsitetype() {
        return touristsitetype;
    }

    public void setTouristsitetype(String touristsitetype) {
        this.touristsitetype = touristsitetype;
    }

    public String getTouristsitename() {
        return touristsitename;
    }

    public void setTouristsitename(String touristsitename) {
        this.touristsitename = touristsitename;
    }

    public String getTouristsitestatus() {
        return touristsitestatus;
    }

    public void setTouristsitestatus(String touristsitestatus) {
        this.touristsitestatus = touristsitestatus;
    }

    public String getTouristsitezonename() {
        return touristsitezonename;
    }

    public void setTouristsitezonename(String touristsitezonename) {
        this.touristsitezonename = touristsitezonename;
    }
}
