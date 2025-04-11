package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationcolleges")
public class EducationCollegeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeid;

    @Column(nullable = false)
    private String collegetype;

    @Column(nullable = false)
    private String collegename;

    private Long collegecontactno;

    private String collegeemail;

    @Column(nullable = false)
    private String collegezonename;

    @Column(nullable = false)
    private String collegeurl;

    // Getters and Setters
    public int getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(int collegeid) {
        this.collegeid = collegeid;
    }

    public String getCollegetype() {
        return collegetype;
    }

    public void setCollegetype(String collegetype) {
        this.collegetype = collegetype;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public Long getCollegecontactno() {
        return collegecontactno;
    }

    public void setCollegecontactno(Long collegecontactno) {
        this.collegecontactno = collegecontactno;
    }

    public String getCollegeemail() {
        return collegeemail;
    }

    public void setCollegeemail(String collegeemail) {
        this.collegeemail = collegeemail;
    }

    public String getCollegezonename() {
        return collegezonename;
    }

    public void setCollegezonename(String collegezonename) {
        this.collegezonename = collegezonename;
    }

    public String getCollegeurl() {
        return collegeurl;
    }

    public void setCollegeurl(String collegeurl) {
        this.collegeurl = collegeurl;
    }
}
