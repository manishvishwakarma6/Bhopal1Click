package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationlibraries")
public class EducationLibraryModel {

    @Id
    private int libraryid;

    @Column(nullable = false)
    private String libraryname;

    private Long contactno;

    @Column(nullable = false)
    private String libraryzonename;

    // Getters and Setters
    public int getLibraryid() {
        return libraryid;
    }

    public void setLibraryid(int libraryid) {
        this.libraryid = libraryid;
    }

    public String getLibraryname() {
        return libraryname;
    }

    public void setLibraryname(String libraryname) {
        this.libraryname = libraryname;
    }

    public Long getContactno() {
        return contactno;
    }

    public void setContactno(Long contactno) {
        this.contactno = contactno;
    }

    public String getLibraryzonename() {
        return libraryzonename;
    }

    public void setLibraryzonename(String libraryzonename) {
        this.libraryzonename = libraryzonename;
    }
}
