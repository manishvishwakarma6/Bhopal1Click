package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "governmentbudget")
public class GovernmentBudgetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int budgetid;

    @Column(nullable = false)
    private String budgettype;

    @Column(nullable = false)
    private String totalbudget;

    @Column(nullable = false)
    private String budgetdate;

    // Constructors
    public GovernmentBudgetModel() {}

    public GovernmentBudgetModel(String budgettype, String totalbudget, String budgetdate) {
        this.budgettype = budgettype;
        this.totalbudget = totalbudget;
        this.budgetdate = budgetdate;
    }

    // Getters and Setters
    public int getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(int budgetid) {
        this.budgetid = budgetid;
    }

    public String getBudgettype() {
        return budgettype;
    }

    public void setBudgettype(String budgettype) {
        this.budgettype = budgettype;
    }

    public String getTotalbudget() {
        return totalbudget;
    }

    public void setTotalbudget(String totalbudget) {
        this.totalbudget = totalbudget;
    }

    public String getBudgetdate() {
        return budgetdate;
    }

    public void setBudgetdate(String budgetdate) {
        this.budgetdate = budgetdate;
    }
}
