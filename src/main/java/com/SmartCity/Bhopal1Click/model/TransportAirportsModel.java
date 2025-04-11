package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transportairports")
public class TransportAirportsModel {

    @Id
    @Column(name = "airportid")
    private int airportId;

    @Column(name = "airportname", nullable = false)
    private String airportName;

    @Column(name = "airportstatus", nullable = false)
    private String airportStatus;

    @Column(name = "airportzonesame", nullable = false)
    private String airportZoneName;

    // Constructors
    public TransportAirportsModel() {
    }

    public TransportAirportsModel(int airportId, String airportName, String airportStatus, String airportZoneName) {
        this.airportId = airportId;
        this.airportName = airportName;
        this.airportStatus = airportStatus;
        this.airportZoneName = airportZoneName;
    }

    // Getters and Setters
    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportStatus() {
        return airportStatus;
    }

    public void setAirportStatus(String airportStatus) {
        this.airportStatus = airportStatus;
    }

    public String getAirportZoneName() {
        return airportZoneName;
    }

    public void setAirportZoneName(String airportZoneName) {
        this.airportZoneName = airportZoneName;
    }
}
