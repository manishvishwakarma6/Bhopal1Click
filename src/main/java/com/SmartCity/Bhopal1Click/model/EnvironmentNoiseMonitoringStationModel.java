package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "environmentnoisemonitoringstations")
public class EnvironmentNoiseMonitoringStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noisemonitorstationid")
    private int noisemonitorstationid;

    @Column(name = "noisemonitorstationname", nullable = false)
    private String noisemonitorstationname;

    @Column(name = "noisemonitorstatus", nullable = false)
    private String noisemonitorstatus;

    @Column(name = "noisemonitorstationzonename", nullable = false)
    private String noisemonitorstationzonename;

    // Constructors
    public EnvironmentNoiseMonitoringStationModel() {
    }

    public EnvironmentNoiseMonitoringStationModel(int noisemonitorstationid, String noisemonitorstationname, String noisemonitorstatus, String noisemonitorstationzonename) {
        this.noisemonitorstationid = noisemonitorstationid;
        this.noisemonitorstationname = noisemonitorstationname;
        this.noisemonitorstatus = noisemonitorstatus;
        this.noisemonitorstationzonename = noisemonitorstationzonename;
    }

    // Getters and Setters
    public int getNoisemonitorstationid() {
        return noisemonitorstationid;
    }

    public void setNoisemonitorstationid(int noisemonitorstationid) {
        this.noisemonitorstationid = noisemonitorstationid;
    }

    public String getNoisemonitorstationname() {
        return noisemonitorstationname;
    }

    public void setNoisemonitorstationname(String noisemonitorstationname) {
        this.noisemonitorstationname = noisemonitorstationname;
    }

    public String getNoisemonitorstatus() {
        return noisemonitorstatus;
    }

    public void setNoisemonitorstatus(String noisemonitorstatus) {
        this.noisemonitorstatus = noisemonitorstatus;
    }

    public String getNoisemonitorstationzonename() {
        return noisemonitorstationzonename;
    }

    public void setNoisemonitorstationzonename(String noisemonitorstationzonename) {
        this.noisemonitorstationzonename = noisemonitorstationzonename;
    }
}
