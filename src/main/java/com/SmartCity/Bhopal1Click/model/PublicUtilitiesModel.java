package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactdirectorypublicutilities")
public class PublicUtilitiesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publicid;

    private String publiccategory;
    private String publicservicename;
    private Long publicphoneno;
    private String publicemail;

    // Constructors
    public PublicUtilitiesModel() {}

    public PublicUtilitiesModel(int publicid, String publiccategory, String publicservicename, Long publicphoneno, String publicemail) {
        this.publicid = publicid;
        this.publiccategory = publiccategory;
        this.publicservicename = publicservicename;
        this.publicphoneno = publicphoneno;
        this.publicemail = publicemail;
    }

    // Getters and Setters
    public int getPublicid() {
        return publicid;
    }

    public void setPublicid(int publicid) {
        this.publicid = publicid;
    }

    public String getPubliccategory() {
        return publiccategory;
    }

    public void setPubliccategory(String publiccategory) {
        this.publiccategory = publiccategory;
    }

    public String getPublicservicename() {
        return publicservicename;
    }

    public void setPublicservicename(String publicservicename) {
        this.publicservicename = publicservicename;
    }

    public Long getPublicphoneno() {
        return publicphoneno;
    }

    public void setPublicphoneno(Long publicphoneno) {
        this.publicphoneno = publicphoneno;
    }

    public String getPublicemail() {
        return publicemail;
    }

    public void setPublicemail(String publicemail) {
        this.publicemail = publicemail;
    }
}
