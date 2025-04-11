package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationofficers")
public class EducationOfficerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int officerid;

    @Column(nullable = false)
    private String officername;

    @Column(nullable = false)
    private String post;

    @Column(nullable = false)
    private long officenumber;

    // Getters and Setters

    public int getOfficerid() {
        return officerid;
    }

    public void setOfficerid(int officerid) {
        this.officerid = officerid;
    }

    public String getOfficername() {
        return officername;
    }

    public void setOfficername(String officername) {
        this.officername = officername;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public long getOfficenumber() {
        return officenumber;
    }

    public void setOfficenumber(long officenumber) {
        this.officenumber = officenumber;
    }
}
