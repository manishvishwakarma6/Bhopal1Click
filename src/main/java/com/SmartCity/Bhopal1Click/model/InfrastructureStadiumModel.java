package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructurestadiums")
public class InfrastructureStadiumModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stadiumid")
    private int stadiumId;

    @Column(name = "stadiumname", nullable = false)
    private String stadiumName;

    @Column(name = "stadiumlength", nullable = false)
    private String stadiumLength;

    @Column(name = "stadiumzonename", nullable = false)
    private String stadiumZoneName;

    // Constructors
    public InfrastructureStadiumModel() {}

    public InfrastructureStadiumModel(int stadiumId, String stadiumName, String stadiumLength, String stadiumZoneName) {
        this.stadiumId = stadiumId;
        this.stadiumName = stadiumName;
        this.stadiumLength = stadiumLength;
        this.stadiumZoneName = stadiumZoneName;
    }

    // Getters and Setters
    public int getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(int stadiumId) {
        this.stadiumId = stadiumId;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public String getStadiumLength() {
        return stadiumLength;
    }

    public void setStadiumLength(String stadiumLength) {
        this.stadiumLength = stadiumLength;
    }

    public String getStadiumZoneName() {
        return stadiumZoneName;
    }

    public void setStadiumZoneName(String stadiumZoneName) {
        this.stadiumZoneName = stadiumZoneName;
    }
}
