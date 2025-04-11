package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactdirectoryemergencycontacts")
public class EmergencyContactsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emrgid;

    private String emrgcontactype;
    private String contactname;
    private long emrgphoneno;

    // Constructors
    public EmergencyContactsModel() {}

    public EmergencyContactsModel(int emrgid, String emrgcontactype, String contactname, long emrgphoneno) {
        this.emrgid = emrgid;
        this.emrgcontactype = emrgcontactype;
        this.contactname = contactname;
        this.emrgphoneno = emrgphoneno;
    }

    // Getters and Setters
    public int getEmrgid() {
        return emrgid;
    }

    public void setEmrgid(int emrgid) {
        this.emrgid = emrgid;
    }

    public String getEmrgcontactype() {
        return emrgcontactype;
    }

    public void setEmrgcontactype(String emrgcontactype) {
        this.emrgcontactype = emrgcontactype;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public long getEmrgphoneno() {
        return emrgphoneno;
    }

    public void setEmrgphoneno(long emrgphoneno) {
        this.emrgphoneno = emrgphoneno;
    }
}
