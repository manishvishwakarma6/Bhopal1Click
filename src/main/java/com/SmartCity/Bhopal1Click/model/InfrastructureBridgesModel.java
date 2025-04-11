package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructurebridges")
public class InfrastructureBridgesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bridgeid")
    private int bridgeid;

    @Column(name = "bridgetype", nullable = false)
    private String bridgetype;

    @Column(name = "bridgename", nullable = false)
    private String bridgename;

    @Column(name = "bridgelength", nullable = false)
    private String bridgelength;

    @Column(name = "bridgezonename", nullable = false)
    private String bridgezonename;

    // Constructors
    public InfrastructureBridgesModel() {
    }

    public InfrastructureBridgesModel(int bridgeid, String bridgetype, String bridgename, String bridgelength, String bridgezonename) {
        this.bridgeid = bridgeid;
        this.bridgetype = bridgetype;
        this.bridgename = bridgename;
        this.bridgelength = bridgelength;
        this.bridgezonename = bridgezonename;
    }

    // Getters and Setters
    public int getBridgeid() {
        return bridgeid;
    }

    public void setBridgeid(int bridgeid) {
        this.bridgeid = bridgeid;
    }

    public String getBridgetype() {
        return bridgetype;
    }

    public void setBridgetype(String bridgetype) {
        this.bridgetype = bridgetype;
    }

    public String getBridgename() {
        return bridgename;
    }

    public void setBridgename(String bridgename) {
        this.bridgename = bridgename;
    }

    public String getBridgelength() {
        return bridgelength;
    }

    public void setBridgelength(String bridgelength) {
        this.bridgelength = bridgelength;
    }

    public String getBridgezonename() {
        return bridgezonename;
    }

    public void setBridgezonename(String bridgezonename) {
        this.bridgezonename = bridgezonename;
    }
}
