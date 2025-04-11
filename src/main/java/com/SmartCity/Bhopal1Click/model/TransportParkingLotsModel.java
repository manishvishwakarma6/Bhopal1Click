package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transportparkinglots")
public class TransportParkingLotsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parkingid;

    @Column(nullable = false)
    private String parkingtype;

    @Column(nullable = false)
    private String parkingname;

    @Column(nullable = false)
    private int parkingsize;

    @Column(nullable = false)
    private String parkingzonename;

    // Constructors
    public TransportParkingLotsModel() {}

    public TransportParkingLotsModel(int parkingid, String parkingtype, String parkingname, int parkingsize, String parkingzonename) {
        this.parkingid = parkingid;
        this.parkingtype = parkingtype;
        this.parkingname = parkingname;
        this.parkingsize = parkingsize;
        this.parkingzonename = parkingzonename;
    }

    // Getters and Setters
    public int getParkingid() { return parkingid; }
    public void setParkingid(int parkingid) { this.parkingid = parkingid; }

    public String getParkingtype() { return parkingtype; }
    public void setParkingtype(String parkingtype) { this.parkingtype = parkingtype; }

    public String getParkingname() { return parkingname; }
    public void setParkingname(String parkingname) { this.parkingname = parkingname; }

    public int getParkingsize() { return parkingsize; }
    public void setParkingsize(int parkingsize) { this.parkingsize = parkingsize; }

    public String getParkingzonename() { return parkingzonename; }
    public void setParkingzonename(String parkingzonename) { this.parkingzonename = parkingzonename; }
}
