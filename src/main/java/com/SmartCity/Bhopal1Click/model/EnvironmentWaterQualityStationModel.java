package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "environmentwaterqualitystations")
public class EnvironmentWaterQualityStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "waterqualitystationid")
    private int waterqualitystationid;

    @Column(name = "waterqualitystationname", nullable = false)
    private String waterqualitystationname;

    @Column(name = "waterqualitymoniterdby", nullable = false)
    private String waterqualitymoniterdby;

    @Column(name = "waterqualitystatus", nullable = false)
    private String waterqualitystatus;

    @Column(name = "waterqualitystationzonename", nullable = false)
    private String waterqualitystationzonename;

    // Constructors
    public EnvironmentWaterQualityStationModel() {
    }

    public EnvironmentWaterQualityStationModel(int waterqualitystationid, String waterqualitystationname, String waterqualitymoniterdby, String waterqualitystatus, String waterqualitystationzonename) {
        this.waterqualitystationid = waterqualitystationid;
        this.waterqualitystationname = waterqualitystationname;
        this.waterqualitymoniterdby = waterqualitymoniterdby;
        this.waterqualitystatus = waterqualitystatus;
        this.waterqualitystationzonename = waterqualitystationzonename;
    }

    // Getters and Setters
    public int getWaterqualitystationid() {
        return waterqualitystationid;
    }

    public void setWaterqualitystationid(int waterqualitystationid) {
        this.waterqualitystationid = waterqualitystationid;
    }

    public String getWaterqualitystationname() {
        return waterqualitystationname;
    }

    public void setWaterqualitystationname(String waterqualitystationname) {
        this.waterqualitystationname = waterqualitystationname;
    }

    public String getWaterqualitymoniterdby() {
        return waterqualitymoniterdby;
    }

    public void setWaterqualitymoniterdby(String waterqualitymoniterdby) {
        this.waterqualitymoniterdby = waterqualitymoniterdby;
    }

    public String getWaterqualitystatus() {
        return waterqualitystatus;
    }

    public void setWaterqualitystatus(String waterqualitystatus) {
        this.waterqualitystatus = waterqualitystatus;
    }

    public String getWaterqualitystationzonename() {
        return waterqualitystationzonename;
    }

    public void setWaterqualitystationzonename(String waterqualitystationzonename) {
        this.waterqualitystationzonename = waterqualitystationzonename;
    }
}
