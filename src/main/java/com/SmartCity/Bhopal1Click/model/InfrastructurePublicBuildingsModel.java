package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructurepublicbuildings")
public class InfrastructurePublicBuildingsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buildingid")
    private int buildingid;

    @Column(name = "buildingtype", nullable = false)
    private String buildingtype;

    @Column(name = "buildingname", nullable = false)
    private String buildingname;

    @Column(name = "buildingfloors", nullable = false)
    private String buildingfloors;

    @Column(name = "buildingzonename", nullable = false)
    private String buildingzonename;

    // Constructors
    public InfrastructurePublicBuildingsModel() {}

    public InfrastructurePublicBuildingsModel(int buildingid, String buildingtype, String buildingname, String buildingfloors, String buildingzonename) {
        this.buildingid = buildingid;
        this.buildingtype = buildingtype;
        this.buildingname = buildingname;
        this.buildingfloors = buildingfloors;
        this.buildingzonename = buildingzonename;
    }

    // Getters and Setters
    public int getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(int buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(String buildingtype) {
        this.buildingtype = buildingtype;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getBuildingfloors() {
        return buildingfloors;
    }

    public void setBuildingfloors(String buildingfloors) {
        this.buildingfloors = buildingfloors;
    }

    public String getBuildingzonename() {
        return buildingzonename;
    }

    public void setBuildingzonename(String buildingzonename) {
        this.buildingzonename = buildingzonename;
    }
}
