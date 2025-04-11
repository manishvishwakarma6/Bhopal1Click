package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructureparkinglots")
public class InfrastructureParkingModel {

    @Id
    @Column(name = "parkingid")
    private int parkingid;

    @Column(name = "parkingtype", nullable = false)
    private String parkingType;

    @Column(name = "parkingname", nullable = false)
    private String parkingName;

    @Column(name = "parkingcapacity", nullable = false)
    private String parkingCapacity;

    @Column(name = "parkingzonename", nullable = false)
    private String parkingZoneName;

    // Constructors
    public InfrastructureParkingModel() {}

    public InfrastructureParkingModel(int parkingid, String parkingType, String parkingName, String parkingCapacity, String parkingZoneName) {
        this.parkingid = parkingid;
        this.parkingType = parkingType;
        this.parkingName = parkingName;
        this.parkingCapacity = parkingCapacity;
        this.parkingZoneName = parkingZoneName;
    }

    // Getters and Setters
    public int getParkingid() {
        return parkingid;
    }

    public void setParkingid(int parkingid) {
        this.parkingid = parkingid;
    }

    public String getParkingType() {
        return parkingType;
    }

    public void setParkingType(String parkingType) {
        this.parkingType = parkingType;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingCapacity() {
        return parkingCapacity;
    }

    public void setParkingCapacity(String parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    public String getParkingZoneName() {
        return parkingZoneName;
    }

    public void setParkingZoneName(String parkingZoneName) {
        this.parkingZoneName = parkingZoneName;
    }
}
