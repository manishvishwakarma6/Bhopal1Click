package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "healthcaredoctor")
public class HealthcareDoctorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drid")
    private int drid;

    @Column(name = "drname", nullable = false)
    private String drname;

    @Column(name = "speciality", nullable = false)
    private String speciality;

    @Column(name = "hospitalname", nullable = false)
    private String hospitalname;

    @Column(name = "qualification", nullable = false)
    private String qualification;

    @Column(name = "availabilitydays", nullable = false)
    private String availabilitydays;

    @Column(name = "drcontact")
    private Long drcontact;

    @Column(name = "timing")
    private String timing;

    @Column(name = "zonename")
    private String zonename;

    // Constructors
    public HealthcareDoctorModel() {
    }

    public HealthcareDoctorModel(int drid, String drname, String speciality, String hospitalname,
                                  String qualification, String availabilitydays, Long drcontact, String timing, String zonename) {
        this.drid = drid;
        this.drname = drname;
        this.speciality = speciality;
        this.hospitalname = hospitalname;
        this.qualification = qualification;
        this.availabilitydays = availabilitydays;
        this.drcontact = drcontact;
        this.timing = timing;
        this.zonename = zonename;
    }

    // Getters and Setters
    public int getDrid() {
        return drid;
    }

    public void setDrid(int drid) {
        this.drid = drid;
    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        this.drname = drname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAvailabilitydays() {
        return availabilitydays;
    }

    public void setAvailabilitydays(String availabilitydays) {
        this.availabilitydays = availabilitydays;
    }

    public Long getDrcontact() {
        return drcontact;
    }

    public void setDrcontact(Long drcontact) {
        this.drcontact = drcontact;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename;
    }
}
