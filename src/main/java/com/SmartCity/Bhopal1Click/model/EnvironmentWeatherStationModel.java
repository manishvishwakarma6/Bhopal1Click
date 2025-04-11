package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "environmentweatherstations")
public class EnvironmentWeatherStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weatherstationid")
    private int weatherstationid;

    @Column(name = "weatherstationname")
    private String weatherstationname;

    @Column(name = "weatherstationstatus")
    private String weatherstationstatus;

    @Column(name = "weatherstationLzonename")
    private String weatherstationLzonename;

    // Constructors
    public EnvironmentWeatherStationModel() {
    }

    public EnvironmentWeatherStationModel(int weatherstationid, String weatherstationname, String weatherstationstatus, String weatherstationLzonename) {
        this.weatherstationid = weatherstationid;
        this.weatherstationname = weatherstationname;
        this.weatherstationstatus = weatherstationstatus;
        this.weatherstationLzonename = weatherstationLzonename;
    }

    // Getters and Setters
    public int getWeatherstationid() {
        return weatherstationid;
    }

    public void setWeatherstationid(int weatherstationid) {
        this.weatherstationid = weatherstationid;
    }

    public String getWeatherstationname() {
        return weatherstationname;
    }

    public void setWeatherstationname(String weatherstationname) {
        this.weatherstationname = weatherstationname;
    }

    public String getWeatherstationstatus() {
        return weatherstationstatus;
    }

    public void setWeatherstationstatus(String weatherstationstatus) {
        this.weatherstationstatus = weatherstationstatus;
    }

    public String getWeatherstationLzonename() {
        return weatherstationLzonename;
    }

    public void setWeatherstationLzonename(String weatherstationLzonename) {
        this.weatherstationLzonename = weatherstationLzonename;
    }
}
