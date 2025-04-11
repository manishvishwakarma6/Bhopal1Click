package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "urbandevelopmentlandrecords")
public class UrbanDevelopmentLandRecordsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "landrecordid")
    private int landrecordid;

    @Column(name = "landtype", nullable = false)
    private String landtype;

    @Column(name = "landlocation", nullable = false)
    private String landlocation;

    @Column(name = "landsize", nullable = false)
    private String landsize;

    @Column(name = "landusagetype", nullable = false)
    private String landusagetype;

    @Column(name = "landstatus", nullable = false)
    private String landstatus;

    @Column(name = "developmentplan", nullable = false)
    private String developmentplan;

    @Column(name = "landzonename", nullable = false)
    private String landzonename;

    // Constructors
    public UrbanDevelopmentLandRecordsModel() {}

    public UrbanDevelopmentLandRecordsModel(int landrecordid, String landtype, String landlocation, String landsize,
                                            String landusagetype, String landstatus, String developmentplan, String landzonename) {
        this.landrecordid = landrecordid;
        this.landtype = landtype;
        this.landlocation = landlocation;
        this.landsize = landsize;
        this.landusagetype = landusagetype;
        this.landstatus = landstatus;
        this.developmentplan = developmentplan;
        this.landzonename = landzonename;
    }

    // Getters and Setters
    public int getLandrecordid() {
        return landrecordid;
    }

    public void setLandrecordid(int landrecordid) {
        this.landrecordid = landrecordid;
    }

    public String getLandtype() {
        return landtype;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype;
    }

    public String getLandlocation() {
        return landlocation;
    }

    public void setLandlocation(String landlocation) {
        this.landlocation = landlocation;
    }

    public String getLandsize() {
        return landsize;
    }

    public void setLandsize(String landsize) {
        this.landsize = landsize;
    }

    public String getLandusagetype() {
        return landusagetype;
    }

    public void setLandusagetype(String landusagetype) {
        this.landusagetype = landusagetype;
    }

    public String getLandstatus() {
        return landstatus;
    }

    public void setLandstatus(String landstatus) {
        this.landstatus = landstatus;
    }

    public String getDevelopmentplan() {
        return developmentplan;
    }

    public void setDevelopmentplan(String developmentplan) {
        this.developmentplan = developmentplan;
    }

    public String getLandzonename() {
        return landzonename;
    }

    public void setLandzonename(String landzonename) {
        this.landzonename = landzonename;
    }
}
