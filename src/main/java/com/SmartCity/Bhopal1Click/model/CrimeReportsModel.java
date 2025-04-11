package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "crimereports")
public class CrimeReportsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caseid;

    @Column(nullable = false)
    private String policestationname;

    @Column(nullable = false)
    private String stnno;

    @Column(nullable = false)
    private String firno;

    private String caseregistrationdate;
    private String firdate;

    @Column(nullable = false)
    private String caseno;

    @Column(nullable = false)
    private String category;

    private String acts;

    // Constructors
    public CrimeReportsModel() {}

    public CrimeReportsModel(int caseid, String policestationname, String stnno, String firno, String caseregistrationdate, String firdate, String caseno, String category, String acts) {
        this.caseid = caseid;
        this.policestationname = policestationname;
        this.stnno = stnno;
        this.firno = firno;
        this.caseregistrationdate = caseregistrationdate;
        this.firdate = firdate;
        this.caseno = caseno;
        this.category = category;
        this.acts = acts;
    }

    // Getters and Setters
    public int getCaseid() { return caseid; }
    public void setCaseid(int caseid) { this.caseid = caseid; }

    public String getPolicestationname() { return policestationname; }
    public void setPolicestationname(String policestationname) { this.policestationname = policestationname; }

    public String getStnno() { return stnno; }
    public void setStnno(String stnno) { this.stnno = stnno; }

    public String getFirno() { return firno; }
    public void setFirno(String firno) { this.firno = firno; }

    public String getCaseregistrationdate() { return caseregistrationdate; }
    public void setCaseregistrationdate(String caseregistrationdate) { this.caseregistrationdate = caseregistrationdate; }

    public String getFirdate() { return firdate; }
    public void setFirdate(String firdate) { this.firdate = firdate; }

    public String getCaseno() { return caseno; }
    public void setCaseno(String caseno) { this.caseno = caseno; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getActs() { return acts; }
    public void setActs(String acts) { this.acts = acts; }
}
