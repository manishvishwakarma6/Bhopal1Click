package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energywatersupply")
public class EnergyWaterSupplyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int watermeterid;

    @Column(nullable = false)
    private String watertype;

    @Column(nullable = false)
    private String watersupplystationname;

    @Column(nullable = false)
    private String waterzonename;

    // Constructors
    public EnergyWaterSupplyModel() {}

    public EnergyWaterSupplyModel(int watermeterid, String watertype, String watersupplystationname, String waterzonename) {
        this.watermeterid = watermeterid;
        this.watertype = watertype;
        this.watersupplystationname = watersupplystationname;
        this.waterzonename = waterzonename;
    }

    // Getters and Setters
    public int getWatermeterid() {
        return watermeterid;
    }

    public void setWatermeterid(int watermeterid) {
        this.watermeterid = watermeterid;
    }

    public String getWatertype() {
        return watertype;
    }

    public void setWatertype(String watertype) {
        this.watertype = watertype;
    }

    public String getWatersupplystationname() {
        return watersupplystationname;
    }

    public void setWatersupplystationname(String watersupplystationname) {
        this.watersupplystationname = watersupplystationname;
    }

    public String getWaterzonename() {
        return waterzonename;
    }

    public void setWaterzonename(String waterzonename) {
        this.waterzonename = waterzonename;
    }
}
