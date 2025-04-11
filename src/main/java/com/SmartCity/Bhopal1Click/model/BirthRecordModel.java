package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "birthrecord")
public class BirthRecordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int birthid;

    @Column(nullable = false)
    private long birthcount;

    @Column(nullable = false)
    private String daterecordedtsart;

    @Column(nullable = false)
    private String daterecordedend;

    // Constructors
    public BirthRecordModel() {}

    public BirthRecordModel(int birthid, long birthcount, String daterecordedtsart, String daterecordedend) {
        this.birthid = birthid;
        this.birthcount = birthcount;
        this.daterecordedtsart = daterecordedtsart;
        this.daterecordedend = daterecordedend;
    }

    // Getters and Setters
    public int getBirthid() {
        return birthid;
    }

    public void setBirthid(int birthid) {
        this.birthid = birthid;
    }

    public long getBirthcount() {
        return birthcount;
    }

    public void setBirthcount(long birthcount) {
        this.birthcount = birthcount;
    }

    public String getDaterecordedtsart() {
        return daterecordedtsart;
    }

    public void setDaterecordedtsart(String daterecordedtsart) {
        this.daterecordedtsart = daterecordedtsart;
    }

    public String getDaterecordedend() {
        return daterecordedend;
    }

    public void setDaterecordedend(String daterecordedend) {
        this.daterecordedend = daterecordedend;
    }
}
