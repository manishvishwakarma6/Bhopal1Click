package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "environmentairqualitystations")
public class EnvironmentAirQualityStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airqualitystationid")
    private int airqualitystationid;

    @Column(name = "airqualitystationname", nullable = false)
    private String airqualitystationname;

    @Column(name = "airqualitypollutantsmeasured", nullable = false, columnDefinition = "TEXT")
    private String airqualitypollutantsmeasured;

    @Column(name = "airqualitystatus", nullable = false)
    private String airqualitystatus;

    @Column(name = "airqualityzonename", nullable = false)
    private String airqualityzonename;

    // Constructors
    public EnvironmentAirQualityStationModel() {
    }

    public EnvironmentAirQualityStationModel(int airqualitystationid, String airqualitystationname, String airqualitypollutantsmeasured, String airqualitystatus, String airqualityzonename) {
        this.airqualitystationid = airqualitystationid;
        this.airqualitystationname = airqualitystationname;
        this.airqualitypollutantsmeasured = airqualitypollutantsmeasured;
        this.airqualitystatus = airqualitystatus;
        this.airqualityzonename = airqualityzonename;
    }

    // Getters and Setters
    public int getAirqualitystationid() {
        return airqualitystationid;
    }

    public void setAirqualitystationid(int airqualitystationid) {
        this.airqualitystationid = airqualitystationid;
    }

    public String getAirqualitystationname() {
        return airqualitystationname;
    }

    public void setAirqualitystationname(String airqualitystationname) {
        this.airqualitystationname = airqualitystationname;
    }

    public String getAirqualitypollutantsmeasured() {
        return airqualitypollutantsmeasured;
    }

    public void setAirqualitypollutantsmeasured(String airqualitypollutantsmeasured) {
        this.airqualitypollutantsmeasured = airqualitypollutantsmeasured;
    }

    public String getAirqualitystatus() {
        return airqualitystatus;
    }

    public void setAirqualitystatus(String airqualitystatus) {
        this.airqualitystatus = airqualitystatus;
    }

    public String getAirqualityzonename() {
        return airqualityzonename;
    }

    public void setAirqualityzonename(String airqualityzonename) {
        this.airqualityzonename = airqualityzonename;
    }
}
