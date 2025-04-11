package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energygassupply")
public class EnergyGasSupplyModel {

    @Id
    @Column(name = "gasid")
    private int gasId;

    @Column(name = "gastype", nullable = false)
    private String gasType;

    @Column(name = "gasstationname", nullable = false)
    private String gasStationName;

    @Column(name = "gaszonename", nullable = false)
    private String gasZoneName;

    // Constructors
    public EnergyGasSupplyModel() {}

    public EnergyGasSupplyModel(int gasId, String gasType, String gasStationName, String gasZoneName) {
        this.gasId = gasId;
        this.gasType = gasType;
        this.gasStationName = gasStationName;
        this.gasZoneName = gasZoneName;
    }

    // Getters and Setters
    public int getGasId() {
        return gasId;
    }

    public void setGasId(int gasId) {
        this.gasId = gasId;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public String getGasStationName() {
        return gasStationName;
    }

    public void setGasStationName(String gasStationName) {
        this.gasStationName = gasStationName;
    }

    public String getGasZoneName() {
        return gasZoneName;
    }

    public void setGasZoneName(String gasZoneName) {
        this.gasZoneName = gasZoneName;
    }
}
