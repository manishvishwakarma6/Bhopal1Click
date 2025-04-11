package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicsafetycrimecases")
public class CrimeCaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int crimecaseid;

    private String crimecasetype;
    private String crimecasename;
    private String crimecaserating;
    private String crimecasestatus;
    private String crimecasedate;

    // Constructors
    public CrimeCaseModel() {}

    public CrimeCaseModel(int crimecaseid, String crimecasetype, String crimecasename, String crimecaserating, String crimecasestatus, String crimecasedate) {
        this.crimecaseid = crimecaseid;
        this.crimecasetype = crimecasetype;
        this.crimecasename = crimecasename;
        this.crimecaserating = crimecaserating;
        this.crimecasestatus = crimecasestatus;
        this.crimecasedate = crimecasedate;
    }

    // Getters and Setters
    public int getCrimecaseid() { return crimecaseid; }
    public void setCrimecaseid(int crimecaseid) { this.crimecaseid = crimecaseid; }

    public String getCrimecasetype() { return crimecasetype; }
    public void setCrimecasetype(String crimecasetype) { this.crimecasetype = crimecasetype; }

    public String getCrimecasename() { return crimecasename; }
    public void setCrimecasename(String crimecasename) { this.crimecasename = crimecasename; }

    public String getCrimecaserating() { return crimecaserating; }
    public void setCrimecaserating(String crimecaserating) { this.crimecaserating = crimecaserating; }

    public String getCrimecasestatus() { return crimecasestatus; }
    public void setCrimecasestatus(String crimecasestatus) { this.crimecasestatus = crimecasestatus; }

    public String getCrimecasedate() { return crimecasedate; }
    public void setCrimecasedate(String crimecasedate) { this.crimecasedate = crimecasedate; }
}
