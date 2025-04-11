package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transportmetrostation")
public class TransportMetroStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int metrostationid;

    @Column(nullable = false)
    private String metrostationname;

    @Column(nullable = false)
    private String metroservicestatus;

    @Column(nullable = false)
    private String metrostationzonename;

    // Constructors
    public TransportMetroStationModel() {
    }

    public TransportMetroStationModel(int metrostationid, String metrostationname, String metroservicestatus, String metrostationzonename) {
        this.metrostationid = metrostationid;
        this.metrostationname = metrostationname;
        this.metroservicestatus = metroservicestatus;
        this.metrostationzonename = metrostationzonename;
    }

    // Getters and Setters
    public int getMetrostationid() {
        return metrostationid;
    }

    public void setMetrostationid(int metrostationid) {
        this.metrostationid = metrostationid;
    }

    public String getMetrostationname() {
        return metrostationname;
    }

    public void setMetrostationname(String metrostationname) {
        this.metrostationname = metrostationname;
    }

    public String getMetroservicestatus() {
        return metroservicestatus;
    }

    public void setMetroservicestatus(String metroservicestatus) {
        this.metroservicestatus = metroservicestatus;
    }

    public String getMetrostationzonename() {
        return metrostationzonename;
    }

    public void setMetrostationzonename(String metrostationzonename) {
        this.metrostationzonename = metrostationzonename;
    }
}
