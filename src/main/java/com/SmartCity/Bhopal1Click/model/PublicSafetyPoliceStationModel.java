package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicsafetypolicestation")
public class PublicSafetyPoliceStationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policestationid;

    private String policestationname;
    private Long policestationtelephoneno;
    private Long policestationcontactno;
    private String policestationemail;
    private String policestationzonename;

    // Constructors
    public PublicSafetyPoliceStationModel() {
    }

    public PublicSafetyPoliceStationModel(int policestationid, String policestationname, Long policestationtelephoneno, 
                                          Long policestationcontactno, String policestationemail, String policestationzonename) {
        this.policestationid = policestationid;
        this.policestationname = policestationname;
        this.policestationtelephoneno = policestationtelephoneno;
        this.policestationcontactno = policestationcontactno;
        this.policestationemail = policestationemail;
        this.policestationzonename = policestationzonename;
    }

    // Getters and Setters
    public int getPolicestationid() {
        return policestationid;
    }

    public void setPolicestationid(int policestationid) {
        this.policestationid = policestationid;
    }

    public String getPolicestationname() {
        return policestationname;
    }

    public void setPolicestationname(String policestationname) {
        this.policestationname = policestationname;
    }

    public Long getPolicestationtelephoneno() {
        return policestationtelephoneno;
    }

    public void setPolicestationtelephoneno(Long policestationtelephoneno) {
        this.policestationtelephoneno = policestationtelephoneno;
    }

    public Long getPolicestationcontactno() {
        return policestationcontactno;
    }

    public void setPolicestationcontactno(Long policestationcontactno) {
        this.policestationcontactno = policestationcontactno;
    }

    public String getPolicestationemail() {
        return policestationemail;
    }

    public void setPolicestationemail(String policestationemail) {
        this.policestationemail = policestationemail;
    }

    public String getPolicestationzonename() {
        return policestationzonename;
    }

    public void setPolicestationzonename(String policestationzonename) {
        this.policestationzonename = policestationzonename;
    }
}
