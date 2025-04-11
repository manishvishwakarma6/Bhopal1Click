package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructuremuseums")
public class InfrastructureMuseumsModel {

    @Id
    @Column(name = "museumid")
    private int museumid;

    @Column(name = "museumtype", nullable = false)
    private String museumtype;

    @Column(name = "museumname", nullable = false)
    private String museumname;

    @Column(name = "museumzonename", nullable = false)
    private String museumzonename;

    // Constructors
    public InfrastructureMuseumsModel() {}

    public InfrastructureMuseumsModel(int museumid, String museumtype, String museumname, String museumzonename) {
        this.museumid = museumid;
        this.museumtype = museumtype;
        this.museumname = museumname;
        this.museumzonename = museumzonename;
    }

    // Getters and Setters
    public int getMuseumid() {
        return museumid;
    }

    public void setMuseumid(int museumid) {
        this.museumid = museumid;
    }

    public String getMuseumtype() {
        return museumtype;
    }

    public void setMuseumtype(String museumtype) {
        this.museumtype = museumtype;
    }

    public String getMuseumname() {
        return museumname;
    }

    public void setMuseumname(String museumname) {
        this.museumname = museumname;
    }

    public String getMuseumzonename() {
        return museumzonename;
    }

    public void setMuseumzonename(String museumzonename) {
        this.museumzonename = museumzonename;
    }
}
