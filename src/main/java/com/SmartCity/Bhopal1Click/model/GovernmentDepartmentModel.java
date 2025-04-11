package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "governmentdepartment")
public class GovernmentDepartmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentid;

    @Column(nullable = false)
    private String departmentname;

    private Long departmentphoneno;

    @Column(nullable = false)
    private String departmentzonename;

    // Constructors
    public GovernmentDepartmentModel() {}

    public GovernmentDepartmentModel(int departmentid, String departmentname, Long departmentphoneno, String departmentzonename) {
        this.departmentid = departmentid;
        this.departmentname = departmentname;
        this.departmentphoneno = departmentphoneno;
        this.departmentzonename = departmentzonename;
    }

    // Getters and Setters
    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Long getDepartmentphoneno() {
        return departmentphoneno;
    }

    public void setDepartmentphoneno(Long departmentphoneno) {
        this.departmentphoneno = departmentphoneno;
    }

    public String getDepartmentzonename() {
        return departmentzonename;
    }

    public void setDepartmentzonename(String departmentzonename) {
        this.departmentzonename = departmentzonename;
    }
}
