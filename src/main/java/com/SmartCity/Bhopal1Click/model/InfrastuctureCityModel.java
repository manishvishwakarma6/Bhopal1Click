package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "infrastructurecity")
public class InfrastuctureCityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer infrastructureid;

    private String infrastructuretype;
    private String infrastructurename;
    private String infrastructurecost;
    private String infrastructurestatus;
    private String infrastructurezonename;

    // Getters and Setters
    public Integer getInfrastructureid() {
        return infrastructureid;
    }

    public void setInfrastructureid(Integer infrastructureid) {
        this.infrastructureid = infrastructureid;
    }

    public String getInfrastructuretype() {
        return infrastructuretype;
    }

    public void setInfrastructuretype(String infrastructuretype) {
        this.infrastructuretype = infrastructuretype;
    }

    public String getInfrastructurename() {
        return infrastructurename;
    }

    public void setInfrastructurename(String infrastructurename) {
        this.infrastructurename = infrastructurename;
    }

    public String getInfrastructurecost() {
        return infrastructurecost;
    }

    public void setInfrastructurecost(String infrastructurecost) {
        this.infrastructurecost = infrastructurecost;
    }

    public String getInfrastructurestatus() {
        return infrastructurestatus;
    }

    public void setInfrastructurestatus(String infrastructurestatus) {
        this.infrastructurestatus = infrastructurestatus;
    }

    public String getInfrastructurezonename() {
        return infrastructurezonename;
    }

    public void setInfrastructurezonename(String infrastructurezonename) {
        this.infrastructurezonename = infrastructurezonename;
    }
}

