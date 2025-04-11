package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructuredrainagesystems")
public class InfrastructureDrainageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drainageid")
    private int drainageid;

    @Column(name = "drainageareaserved", nullable = false)
    private String drainageAreaServed;

    @Column(name = "drainagecapacity", nullable = false)
    private String drainageCapacity;

    @Column(name = "drainagezonename", nullable = false)
    private String drainageZoneName;

    // Constructors
    public InfrastructureDrainageModel() {}

    public InfrastructureDrainageModel(int drainageid, String drainageAreaServed, String drainageCapacity, String drainageZoneName) {
        this.drainageid = drainageid;
        this.drainageAreaServed = drainageAreaServed;
        this.drainageCapacity = drainageCapacity;
        this.drainageZoneName = drainageZoneName;
    }

    // Getters and Setters
    public int getDrainageid() {
        return drainageid;
    }

    public void setDrainageid(int drainageid) {
        this.drainageid = drainageid;
    }

    public String getDrainageAreaServed() {
        return drainageAreaServed;
    }

    public void setDrainageAreaServed(String drainageAreaServed) {
        this.drainageAreaServed = drainageAreaServed;
    }

    public String getDrainageCapacity() {
        return drainageCapacity;
    }

    public void setDrainageCapacity(String drainageCapacity) {
        this.drainageCapacity = drainageCapacity;
    }

    public String getDrainageZoneName() {
        return drainageZoneName;
    }

    public void setDrainageZoneName(String drainageZoneName) {
        this.drainageZoneName = drainageZoneName;
    }
}
