package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "energyfuelsupply")
public class EnergyFuelSupplyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fuelsupplyid;

    @Column(nullable = false)
    private String fuelsupplytype;

    @Column(nullable = false)
    private String fuelsupplystationname;

    @Column(nullable = false)
    private String fuelsupplyzonename;

    // Constructors
    public EnergyFuelSupplyModel() {}

    public EnergyFuelSupplyModel(int fuelsupplyid, String fuelsupplytype, String fuelsupplystationname, String fuelsupplyzonename) {
        this.fuelsupplyid = fuelsupplyid;
        this.fuelsupplytype = fuelsupplytype;
        this.fuelsupplystationname = fuelsupplystationname;
        this.fuelsupplyzonename = fuelsupplyzonename;
    }

    // Getters and Setters
    public int getFuelsupplyid() {
        return fuelsupplyid;
    }

    public void setFuelsupplyid(int fuelsupplyid) {
        this.fuelsupplyid = fuelsupplyid;
    }

    public String getFuelsupplytype() {
        return fuelsupplytype;
    }

    public void setFuelsupplytype(String fuelsupplytype) {
        this.fuelsupplytype = fuelsupplytype;
    }

    public String getFuelsupplystationname() {
        return fuelsupplystationname;
    }

    public void setFuelsupplystationname(String fuelsupplystationname) {
        this.fuelsupplystationname = fuelsupplystationname;
    }

    public String getFuelsupplyzonename() {
        return fuelsupplyzonename;
    }

    public void setFuelsupplyzonename(String fuelsupplyzonename) {
        this.fuelsupplyzonename = fuelsupplyzonename;
    }
}