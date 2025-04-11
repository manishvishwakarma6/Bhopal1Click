package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transportrailwaystation")
public class TransportRailwayStationModel {

    @Id
    private int railwaystationid;

    @Column(nullable = false)
    private String railwaystationcode;

    @Column(nullable = false)
    private String railwaystationname;

    @Column(nullable = false)
    private long railwaystationnooftrainpassing;

    @Column(nullable = false)
    private long railwaystationnoofplatforms;

    @Column(nullable = false)
    private String railwaystationstatus;

    @Column(nullable = false)
    private String railwaystationzonename;

    // Constructors
    public TransportRailwayStationModel() {
    }

    public TransportRailwayStationModel(int railwaystationid, String railwaystationcode, String railwaystationname,
                                        long railwaystationnooftrainpassing, long railwaystationnoofplatforms,
                                        String railwaystationstatus, String railwaystationzonename) {
        this.railwaystationid = railwaystationid;
        this.railwaystationcode = railwaystationcode;
        this.railwaystationname = railwaystationname;
        this.railwaystationnooftrainpassing = railwaystationnooftrainpassing;
        this.railwaystationnoofplatforms = railwaystationnoofplatforms;
        this.railwaystationstatus = railwaystationstatus;
        this.railwaystationzonename = railwaystationzonename;
    }

    // Getters and Setters
    public int getRailwaystationid() {
        return railwaystationid;
    }

    public void setRailwaystationid(int railwaystationid) {
        this.railwaystationid = railwaystationid;
    }

    public String getRailwaystationcode() {
        return railwaystationcode;
    }

    public void setRailwaystationcode(String railwaystationcode) {
        this.railwaystationcode = railwaystationcode;
    }

    public String getRailwaystationname() {
        return railwaystationname;
    }

    public void setRailwaystationname(String railwaystationname) {
        this.railwaystationname = railwaystationname;
    }

    public long getRailwaystationnooftrainpassing() {
        return railwaystationnooftrainpassing;
    }

    public void setRailwaystationnooftrainpassing(long railwaystationnooftrainpassing) {
        this.railwaystationnooftrainpassing = railwaystationnooftrainpassing;
    }

    public long getRailwaystationnoofplatforms() {
        return railwaystationnoofplatforms;
    }

    public void setRailwaystationnoofplatforms(long railwaystationnoofplatforms) {
        this.railwaystationnoofplatforms = railwaystationnoofplatforms;
    }

    public String getRailwaystationstatus() {
        return railwaystationstatus;
    }

    public void setRailwaystationstatus(String railwaystationstatus) {
        this.railwaystationstatus = railwaystationstatus;
    }

    public String getRailwaystationzonename() {
        return railwaystationzonename;
    }

    public void setRailwaystationzonename(String railwaystationzonename) {
        this.railwaystationzonename = railwaystationzonename;
    }
}
