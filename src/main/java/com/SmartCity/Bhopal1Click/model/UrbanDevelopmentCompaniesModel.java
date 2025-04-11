package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "urbandevelopmentcompanies")
public class UrbanDevelopmentCompaniesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyid;

    private String companytype;
    private String companyname;
    private String companyzonename;

    // Constructors
    public UrbanDevelopmentCompaniesModel() {}

    public UrbanDevelopmentCompaniesModel(int companyid, String companytype, String companyname, String companyzonename) {
        this.companyid = companyid;
        this.companytype = companytype;
        this.companyname = companyname;
        this.companyzonename = companyzonename;
    }

    // Getters and Setters
    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyzonename() {
        return companyzonename;
    }

    public void setCompanyzonename(String companyzonename) {
        this.companyzonename = companyzonename;
    }
}
