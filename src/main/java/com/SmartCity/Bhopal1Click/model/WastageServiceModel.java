package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Wastageservices")
public class WastageServiceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wastageserviceid;

    @Column(nullable = false)
    private String wastageservicetype;

    @Column(nullable = false)
    private String wastageservicename;

    @Column(nullable = false)
    private String wastageservicezonename;

    // Constructors
    public WastageServiceModel() {}

    public WastageServiceModel(int wastageserviceid, String wastageservicetype, String wastageservicename, String wastageservicezonename) {
        this.wastageserviceid = wastageserviceid;
        this.wastageservicetype = wastageservicetype;
        this.wastageservicename = wastageservicename;
        this.wastageservicezonename = wastageservicezonename;
    }

    // Getters and Setters
    public int getWastageserviceid() {
        return wastageserviceid;
    }

    public void setWastageserviceid(int wastageserviceid) {
        this.wastageserviceid = wastageserviceid;
    }

    public String getWastageservicetype() {
        return wastageservicetype;
    }

    public void setWastageservicetype(String wastageservicetype) {
        this.wastageservicetype = wastageservicetype;
    }

    public String getWastageservicename() {
        return wastageservicename;
    }

    public void setWastageservicename(String wastageservicename) {
        this.wastageservicename = wastageservicename;
    }

    public String getWastageservicezonename() {
        return wastageservicezonename;
    }

    public void setWastageservicezonename(String wastageservicezonename) {
        this.wastageservicezonename = wastageservicezonename;
    }
}
