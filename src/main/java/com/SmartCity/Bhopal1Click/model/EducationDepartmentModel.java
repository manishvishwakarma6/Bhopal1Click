package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationdepartments")
public class EducationDepartmentModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentid;

    @Column(nullable = false)
    private String departmentheadname;

    @Column(nullable = false)
    private long departmentheadphoneno;

    @Column(nullable = false)
    private String departmentheademail;

    @Column(nullable = false)
    private String departmentzonename;

    // Getter and Setter methods

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentheadname() {
        return departmentheadname;
    }

    public void setDepartmentheadname(String departmentheadname) {
        this.departmentheadname = departmentheadname;
    }

    public long getDepartmentheadphoneno() {
        return departmentheadphoneno;
    }

    public void setDepartmentheadphoneno(long departmentheadphoneno) {
        this.departmentheadphoneno = departmentheadphoneno;
    }

    public String getDepartmentheademail() {
        return departmentheademail;
    }

    public void setDepartmentheademail(String departmentheademail) {
        this.departmentheademail = departmentheademail;
    }

    public String getDepartmentzonename() {
        return departmentzonename;
    }

    public void setDepartmentzonename(String departmentzonename) {
        this.departmentzonename = departmentzonename;
    }
}
