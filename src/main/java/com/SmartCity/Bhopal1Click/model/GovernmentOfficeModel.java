package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactdirectorygovernmentoffice")
public class GovernmentOfficeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int officeid;

    private String officecategory;
    private String officename;
    private long officecontact;

    // Constructors
    public GovernmentOfficeModel() {}

    public GovernmentOfficeModel(int officeid, String officecategory, String officename, long officecontact) {
        this.officeid = officeid;
        this.officecategory = officecategory;
        this.officename = officename;
        this.officecontact = officecontact;
    }

    // Getters and Setters
    public int getOfficeid() {
        return officeid;
    }

    public void setOfficeid(int officeid) {
        this.officeid = officeid;
    }

    public String getOfficecategory() {
        return officecategory;
    }

    public void setOfficecategory(String officecategory) {
        this.officecategory = officecategory;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    public long getOfficecontact() {
        return officecontact;
    }

    public void setOfficecontact(long officecontact) {
        this.officecontact = officecontact;
    }
}
