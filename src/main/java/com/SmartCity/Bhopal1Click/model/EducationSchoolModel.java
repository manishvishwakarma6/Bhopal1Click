package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationschools")
public class EducationSchoolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolid;

    @Column(nullable = false)
    private String schooltype;

    @Column(nullable = false)
    private String schoolname;

    private Long schoolcontactno;

    private String schoolemail;

    @Column(nullable = false)
    private String schoolzonename;

    // Getters and Setters
    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    public String getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public Long getSchoolcontactno() {
        return schoolcontactno;
    }

    public void setSchoolcontactno(Long schoolcontactno) {
        this.schoolcontactno = schoolcontactno;
    }

    public String getSchoolemail() {
        return schoolemail;
    }

    public void setSchoolemail(String schoolemail) {
        this.schoolemail = schoolemail;
    }

    public String getSchoolzonename() {
        return schoolzonename;
    }

    public void setSchoolzonename(String schoolzonename) {
        this.schoolzonename = schoolzonename;
    }
}
