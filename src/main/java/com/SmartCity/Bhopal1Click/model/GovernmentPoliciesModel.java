package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "governmentpolicies")
public class GovernmentPoliciesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyid;

    @Column(nullable = false)
    private String policydepartment;

    @Column(nullable = false)
    private String policyscheme;

    // Constructors
    public GovernmentPoliciesModel() {}

    public GovernmentPoliciesModel(int policyid, String policydepartment, String policyscheme) {
        this.policyid = policyid;
        this.policydepartment = policydepartment;
        this.policyscheme = policyscheme;
    }

    // Getters and Setters
    public int getPolicyid() {
        return policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public String getPolicydepartment() {
        return policydepartment;
    }

    public void setPolicydepartment(String policydepartment) {
        this.policydepartment = policydepartment;
    }

    public String getPolicyscheme() {
        return policyscheme;
    }

    public void setPolicyscheme(String policyscheme) {
        this.policyscheme = policyscheme;
    }
}
