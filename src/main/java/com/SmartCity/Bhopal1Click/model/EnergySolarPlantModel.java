package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energysolarplant")
public class EnergySolarPlantModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int solarmeterid;

    @Column(nullable = false)
    private String solarstationname;

    @Column(nullable = false)
    private String solarzonename;

    // Getters and Setters
    public int getSolarmeterid() {
        return solarmeterid;
    }

    public void setSolarmeterid(int solarmeterid) {
        this.solarmeterid = solarmeterid;
    }

    public String getSolarstationname() {
        return solarstationname;
    }

    public void setSolarstationname(String solarstationname) {
        this.solarstationname = solarstationname;
    }

    public String getSolarzonename() {
        return solarzonename;
    }

    public void setSolarzonename(String solarzonename) {
        this.solarzonename = solarzonename;
    }
}
