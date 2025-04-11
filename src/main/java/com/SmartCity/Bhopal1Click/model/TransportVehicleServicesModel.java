package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transportvehicleservices")
public class TransportVehicleServicesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleserviceid;

    @Column(nullable = false)
    private String vehicletype;

    @Column(nullable = false)
    private String vehicleservicename;

    @Column(nullable = false)
    private String vehicleservicestatus;

    private Long phonenumber;
    private String vehiclezonename;

    // Constructors
    public TransportVehicleServicesModel() {}

    public TransportVehicleServicesModel(int vehicleserviceid, String vehicletype, String vehicleservicename, String vehicleservicestatus, Long phonenumber, String vehiclezonename) {
        this.vehicleserviceid = vehicleserviceid;
        this.vehicletype = vehicletype;
        this.vehicleservicename = vehicleservicename;
        this.vehicleservicestatus = vehicleservicestatus;
        this.phonenumber = phonenumber;
        this.vehiclezonename = vehiclezonename;
    }

    // Getters and Setters
    public int getVehicleserviceid() { return vehicleserviceid; }
    public void setVehicleserviceid(int vehicleserviceid) { this.vehicleserviceid = vehicleserviceid; }

    public String getVehicletype() { return vehicletype; }
    public void setVehicletype(String vehicletype) { this.vehicletype = vehicletype; }

    public String getVehicleservicename() { return vehicleservicename; }
    public void setVehicleservicename(String vehicleservicename) { this.vehicleservicename = vehicleservicename; }

    public String getVehicleservicestatus() { return vehicleservicestatus; }
    public void setVehicleservicestatus(String vehicleservicestatus) { this.vehicleservicestatus = vehicleservicestatus; }

    public Long getPhonenumber() { return phonenumber; }
    public void setPhonenumber(Long phonenumber) { this.phonenumber = phonenumber; }

    public String getVehiclezonename() { return vehiclezonename; }
    public void setVehiclezonename(String vehiclezonename) { this.vehiclezonename = vehiclezonename; }
}
