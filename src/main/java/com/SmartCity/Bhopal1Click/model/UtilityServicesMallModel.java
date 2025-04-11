package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "utilityservicesmall")
public class UtilityServicesMallModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mallid")
    private int mallid;

    @Column(name = "mallname", nullable = false)
    private String mallname;

    @Column(name = "mallstatus", nullable = false)
    private String mallstatus;

    @Column(name = "mallzonename", nullable = false)
    private String mallzonename;

    // Constructors
    public UtilityServicesMallModel() {
    }

    public UtilityServicesMallModel(int mallid, String mallname, String mallstatus, String mallzonename) {
        this.mallid = mallid;
        this.mallname = mallname;
        this.mallstatus = mallstatus;
        this.mallzonename = mallzonename;
    }

    // Getters and Setters
    public int getMallid() {
        return mallid;
    }

    public void setMallid(int mallid) {
        this.mallid = mallid;
    }

    public String getMallname() {
        return mallname;
    }

    public void setMallname(String mallname) {
        this.mallname = mallname;
    }

    public String getMallstatus() {
        return mallstatus;
    }

    public void setMallstatus(String mallstatus) {
        this.mallstatus = mallstatus;
    }

    public String getMallzonename() {
        return mallzonename;
    }

    public void setMallzonename(String mallzonename) {
        this.mallzonename = mallzonename;
    }
}
