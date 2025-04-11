package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "urbandevelopmenthousingprojects")
public class UrbanDevelopmentHousingProjectsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "housingprojectid")
    private int housingprojectid;

    @Column(name = "housingprojecttype", nullable = false)
    private String housingprojecttype;

    @Column(name = "housingprojectname", nullable = false)
    private String housingprojectname;

    @Column(name = "housingprojectstatus", nullable = false)
    private String housingprojectstatus;

    @Column(name = "housingprojectzonename", nullable = false)
    private String housingprojectzonename;

    // Constructors
    public UrbanDevelopmentHousingProjectsModel() {
    }

    public UrbanDevelopmentHousingProjectsModel(int housingprojectid, String housingprojecttype, String housingprojectname, String housingprojectstatus, String housingprojectzonename) {
        this.housingprojectid = housingprojectid;
        this.housingprojecttype = housingprojecttype;
        this.housingprojectname = housingprojectname;
        this.housingprojectstatus = housingprojectstatus;
        this.housingprojectzonename = housingprojectzonename;
    }

    // Getters and Setters
    public int getHousingprojectid() {
        return housingprojectid;
    }

    public void setHousingprojectid(int housingprojectid) {
        this.housingprojectid = housingprojectid;
    }

    public String getHousingprojecttype() {
        return housingprojecttype;
    }

    public void setHousingprojecttype(String housingprojecttype) {
        this.housingprojecttype = housingprojecttype;
    }

    public String getHousingprojectname() {
        return housingprojectname;
    }

    public void setHousingprojectname(String housingprojectname) {
        this.housingprojectname = housingprojectname;
    }

    public String getHousingprojectstatus() {
        return housingprojectstatus;
    }

    public void setHousingprojectstatus(String housingprojectstatus) {
        this.housingprojectstatus = housingprojectstatus;
    }

    public String getHousingprojectzonename() {
        return housingprojectzonename;
    }

    public void setHousingprojectzonename(String housingprojectzonename) {
        this.housingprojectzonename = housingprojectzonename;
    }
}
