package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructureauditoriums")
public class InfrastructureAuditoriumModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auditoriumid")
    private int auditoriumId;

    @Column(name = "audotoriumname", nullable = false)
    private String auditoriumName;

    @Column(name = "auditoriumcapacity", nullable = false)
    private String auditoriumCapacity;

    @Column(name = "auditoriumzonename", nullable = false)
    private String auditoriumZoneName;

    // Constructors
    public InfrastructureAuditoriumModel() {}

    public InfrastructureAuditoriumModel(int auditoriumId, String auditoriumName, String auditoriumCapacity, String auditoriumZoneName) {
        this.auditoriumId = auditoriumId;
        this.auditoriumName = auditoriumName;
        this.auditoriumCapacity = auditoriumCapacity;
        this.auditoriumZoneName = auditoriumZoneName;
    }

    // Getters and Setters
    public int getAuditoriumId() {
        return auditoriumId;
    }

    public void setAuditoriumId(int auditoriumId) {
        this.auditoriumId = auditoriumId;
    }

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    public String getAuditoriumCapacity() {
        return auditoriumCapacity;
    }

    public void setAuditoriumCapacity(String auditoriumCapacity) {
        this.auditoriumCapacity = auditoriumCapacity;
    }

    public String getAuditoriumZoneName() {
        return auditoriumZoneName;
    }

    public void setAuditoriumZoneName(String auditoriumZoneName) {
        this.auditoriumZoneName = auditoriumZoneName;
    }
}
