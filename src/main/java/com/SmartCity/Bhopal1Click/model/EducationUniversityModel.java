package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationuniversities")
public class EducationUniversityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int universityid;

    @Column(nullable = false)
    private String universitytype;

    @Column(nullable = false)
    private String universityname;

    private Long universitycontact;

    private String universityemail;

    @Column(nullable = false)
    private String universityzonename;

    @Column(nullable = false)
    private String universityurl;

    // Getters and Setters
    public int getUniversityid() {
        return universityid;
    }

    public void setUniversityid(int universityid) {
        this.universityid = universityid;
    }

    public String getUniversitytype() {
        return universitytype;
    }

    public void setUniversitytype(String universitytype) {
        this.universitytype = universitytype;
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname;
    }

    public Long getUniversitycontact() {
        return universitycontact;
    }

    public void setUniversitycontact(Long universitycontact) {
        this.universitycontact = universitycontact;
    }

    public String getUniversityemail() {
        return universityemail;
    }

    public void setUniversityemail(String universityemail) {
        this.universityemail = universityemail;
    }

    public String getUniversityzonename() {
        return universityzonename;
    }

    public void setUniversityzonename(String universityzonename) {
        this.universityzonename = universityzonename;
    }

    public String getUniversityurl() {
        return universityurl;
    }

    public void setUniversityurl(String universityurl) {
        this.universityurl = universityurl;
    }
}
