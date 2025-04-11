package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "governmentprojects")
public class GovernmentProjectsModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectid;
    
    @Column(nullable = false)
    private String projectname;
    
    @Column(nullable = false)
    private String projectcast;
    
    @Column(nullable = false)
    private String projectstatus;
    
    @Column(nullable = false)
    private String projectdescription;
    
    @Column(nullable = false)
    private String projectzonename;

    // Getter and Setter methods

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectcast() {
        return projectcast;
    }

    public void setProjectcast(String projectcast) {
        this.projectcast = projectcast;
    }

    public String getProjectstatus() {
        return projectstatus;
    }

    public void setProjectstatus(String projectstatus) {
        this.projectstatus = projectstatus;
    }

    public String getProjectdescription() {
        return projectdescription;
    }

    public void setProjectdescription(String projectdescription) {
        this.projectdescription = projectdescription;
    }

    public String getProjectzonename() {
        return projectzonename;
    }

    public void setProjectzonename(String projectzonename) {
        this.projectzonename = projectzonename;
    }
}
