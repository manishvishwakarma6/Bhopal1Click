package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transportbusstation")
public class TransportBusStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busstationid;

    @Column(nullable = false)
    private String busstationname;

    @Column(nullable = false)
    private String busservicestatus;

    @Column(nullable = false)
    private String busstationzonename;

    // Constructors
    public TransportBusStationModel() {
    }

    public TransportBusStationModel(int busstationid, String busstationname, String busservicestatus, String busstationzonename) {
        this.busstationid = busstationid;
        this.busstationname = busstationname;
        this.busservicestatus = busservicestatus;
        this.busstationzonename = busstationzonename;
    }

    // Getters and Setters
    public int getBusstationid() {
        return busstationid;
    }

    public void setBusstationid(int busstationid) {
        this.busstationid = busstationid;
    }

    public String getBusstationname() {
        return busstationname;
    }

    public void setBusstationname(String busstationname) {
        this.busstationname = busstationname;
    }

    public String getBusservicestatus() {
        return busservicestatus;
    }

    public void setBusservicestatus(String busservicestatus) {
        this.busservicestatus = busservicestatus;
    }

    public String getBusstationzonename() {
        return busstationzonename;
    }

    public void setBusstationzonename(String busstationzonename) {
        this.busstationzonename = busstationzonename;
    }
}
