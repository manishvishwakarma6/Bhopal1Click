package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trafficsignal")
public class TrafficSignalModel {

    @Id
    private int signalid;

    @Column(nullable = false)
    private String cameratype;

    @Column(nullable = false)
    private String camerstatus;

    @Column(nullable = false)
    private String signalzonename;

    // Constructors
    public TrafficSignalModel() {}

    public TrafficSignalModel(int signalid, String cameratype, String camerstatus, String signalzonename) {
        this.signalid = signalid;
        this.cameratype = cameratype;
        this.camerstatus = camerstatus;
        this.signalzonename = signalzonename;
    }

    // Getters and Setters
    public int getSignalid() {
        return signalid;
    }

    public void setSignalid(int signalid) {
        this.signalid = signalid;
    }

    public String getCameratype() {
        return cameratype;
    }

    public void setCameratype(String cameratype) {
        this.cameratype = cameratype;
    }

    public String getCamerstatus() {
        return camerstatus;
    }

    public void setCamerstatus(String camerstatus) {
        this.camerstatus = camerstatus;
    }

    public String getSignalzonename() {
        return signalzonename;
    }

    public void setSignalzonename(String signalzonename) {
        this.signalzonename = signalzonename;
    }
}
