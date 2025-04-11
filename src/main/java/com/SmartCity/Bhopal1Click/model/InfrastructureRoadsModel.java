package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructureroads")
public class InfrastructureRoadsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roadid")
    private int roadid;

    @Column(name = "roadtype")
    private String roadtype;

    @Column(name = "roadname")
    private String roadname;

    @Column(name = "roadlength")
    private String roadlength;

    @Column(name = "roadzonename")
    private String roadzonename;

    // Constructors
    public InfrastructureRoadsModel() {
    }

    public InfrastructureRoadsModel(int roadid, String roadtype, String roadname, String roadlength, String roadzonename) {
        this.roadid = roadid;
        this.roadtype = roadtype;
        this.roadname = roadname;
        this.roadlength = roadlength;
        this.roadzonename = roadzonename;
    }

    // Getters and Setters
    public int getRoadid() {
        return roadid;
    }

    public void setRoadid(int roadid) {
        this.roadid = roadid;
    }

    public String getRoadtype() {
        return roadtype;
    }

    public void setRoadtype(String roadtype) {
        this.roadtype = roadtype;
    }

    public String getRoadname() {
        return roadname;
    }

    public void setRoadname(String roadname) {
        this.roadname = roadname;
    }

    public String getRoadlength() {
        return roadlength;
    }

    public void setRoadlength(String roadlength) {
        this.roadlength = roadlength;
    }

    public String getRoadzonename() {
        return roadzonename;
    }

    public void setRoadzonename(String roadzonename) {
        this.roadzonename = roadzonename;
    }
}
