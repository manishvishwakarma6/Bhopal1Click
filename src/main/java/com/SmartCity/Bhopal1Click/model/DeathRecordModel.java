package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "deathrecord")
public class DeathRecordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deathid;

    @Column(nullable = false)
    private long deathcount;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date daterecorded;

    // Constructors
    public DeathRecordModel() {}

    public DeathRecordModel(int deathid, long deathcount, Date daterecorded) {
        this.deathid = deathid;
        this.deathcount = deathcount;
        this.daterecorded = daterecorded;
    }

    // Getters and Setters
    public int getDeathid() {
        return deathid;
    }

    public void setDeathid(int deathid) {
        this.deathid = deathid;
    }

    public long getDeathcount() {
        return deathcount;
    }

    public void setDeathcount(long deathcount) {
        this.deathcount = deathcount;
    }

    public Date getDaterecorded() {
        return daterecorded;
    }

    public void setDaterecorded(Date daterecorded) {
        this.daterecorded = daterecorded;
    }
}
