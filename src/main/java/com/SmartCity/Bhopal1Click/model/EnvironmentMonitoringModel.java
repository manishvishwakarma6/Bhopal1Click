package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "environmentmonitoring")
public class EnvironmentMonitoringModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "environmentmonitorid")
    private int environmentmonitorid;

    @Column(name = "environmentcategoryname", nullable = false)
    private String environmentcategoryname;

    @Column(name = "environmentstatus", nullable = false)
    private String environmentstatus;

    @Column(name = "environmentzonename", nullable = false)
    private String environmentzonename;

    // Constructors
    public EnvironmentMonitoringModel() {
    }

    public EnvironmentMonitoringModel(int environmentmonitorid, String environmentcategoryname, String environmentstatus, String environmentzonename) {
        this.environmentmonitorid = environmentmonitorid;
        this.environmentcategoryname = environmentcategoryname;
        this.environmentstatus = environmentstatus;
        this.environmentzonename = environmentzonename;
    }

    // Getters and Setters
    public int getEnvironmentmonitorid() {
        return environmentmonitorid;
    }

    public void setEnvironmentmonitorid(int environmentmonitorid) {
        this.environmentmonitorid = environmentmonitorid;
    }

    public String getEnvironmentcategoryname() {
        return environmentcategoryname;
    }

    public void setEnvironmentcategoryname(String environmentcategoryname) {
        this.environmentcategoryname = environmentcategoryname;
    }

    public String getEnvironmentstatus() {
        return environmentstatus;
    }

    public void setEnvironmentstatus(String environmentstatus) {
        this.environmentstatus = environmentstatus;
    }

    public String getEnvironmentzonename() {
        return environmentzonename;
    }

    public void setEnvironmentzonename(String environmentzonename) {
        this.environmentzonename = environmentzonename;
    }
}
