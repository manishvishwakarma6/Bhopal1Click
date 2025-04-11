package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "utilityserviceselectronics")
public class UtilityServicesElectronicsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "electronicid")
    private int electronicid;

    @Column(name = "electronicshopname", nullable = false)
    private String electronicshopname;

    @Column(name = "electronicshopstatus", nullable = false)
    private String electronicshopstatus;

    @Column(name = "electroniccontactno")
    private String electroniccontactno;

    @Column(name = "electronicshopzonename", nullable = false)
    private String electronicshopzonename;

    // Constructors
    public UtilityServicesElectronicsModel() {
    }

    public UtilityServicesElectronicsModel(int electronicid, String electronicshopname, String electronicshopstatus, String electroniccontactno, String electronicshopzonename) {
        this.electronicid = electronicid;
        this.electronicshopname = electronicshopname;
        this.electronicshopstatus = electronicshopstatus;
        this.electroniccontactno = electroniccontactno;
        this.electronicshopzonename = electronicshopzonename;
    }

    // Getters and Setters
    public int getElectronicid() {
        return electronicid;
    }

    public void setElectronicid(int electronicid) {
        this.electronicid = electronicid;
    }

    public String getElectronicshopname() {
        return electronicshopname;
    }

    public void setElectronicshopname(String electronicshopname) {
        this.electronicshopname = electronicshopname;
    }

    public String getElectronicshopstatus() {
        return electronicshopstatus;
    }

    public void setElectronicshopstatus(String electronicshopstatus) {
        this.electronicshopstatus = electronicshopstatus;
    }

    public String getElectroniccontactno() {
        return electroniccontactno;
    }

    public void setElectroniccontactno(String electroniccontactno) {
        this.electroniccontactno = electroniccontactno;
    }

    public String getElectronicshopzonename() {
        return electronicshopzonename;
    }

    public void setElectronicshopzonename(String electronicshopzonename) {
        this.electronicshopzonename = electronicshopzonename;
    }
}
