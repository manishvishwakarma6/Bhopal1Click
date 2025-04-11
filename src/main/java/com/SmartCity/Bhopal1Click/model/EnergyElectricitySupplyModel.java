package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energyelectricitysupply")
public class EnergyElectricitySupplyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int electricitymeterid;

    @Column(nullable = false)
    private String electricitytype;

    @Column(nullable = false)
    private String electricityzonename;

    // Constructors
    public EnergyElectricitySupplyModel() {
    }

    public EnergyElectricitySupplyModel(int electricitymeterid, String electricitytype, String electricityzonename) {
        this.electricitymeterid = electricitymeterid;
        this.electricitytype = electricitytype;
        this.electricityzonename = electricityzonename;
    }

    // Getters and Setters
    public int getElectricitymeterid() {
        return electricitymeterid;
    }

    public void setElectricitymeterid(int electricitymeterid) {
        this.electricitymeterid = electricitymeterid;
    }

    public String getElectricitytype() {
        return electricitytype;
    }

    public void setElectricitytype(String electricitytype) {
        this.electricitytype = electricitytype;
    }

    public String getElectricityzonename() {
        return electricityzonename;
    }

    public void setElectricityzonename(String electricityzonename) {
        this.electricityzonename = electricityzonename;
    }
}
