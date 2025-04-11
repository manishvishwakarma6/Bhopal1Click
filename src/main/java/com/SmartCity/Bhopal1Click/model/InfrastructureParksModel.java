package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructureparks")
public class InfrastructureParksModel {
	    @Id
	    private int parkid;

	    @Column(nullable = false)
	    private String parktype;

	    @Column(nullable = false)
	    private String parkname;

	    @Column(nullable = false)
	    private String parkzonename;

	    // Constructors
	    public InfrastructureParksModel() {
	    }

	    public InfrastructureParksModel(int parkid, String parktype, String parkname, String parkzonename) {
	        this.parkid = parkid;
	        this.parktype = parktype;
	        this.parkname = parkname;
	        this.parkzonename = parkzonename;
	    }

	    // Getters and Setters
	    public int getParkid() {
	        return parkid;
	    }

	    public void setParkid(int parkid) {
	        this.parkid = parkid;
	    }

	    public String getParktype() {
	        return parktype;
	    }

	    public void setParktype(String parktype) {
	        this.parktype = parktype;
	    }

	    public String getParkname() {
	        return parkname;
	    }

	    public void setParkname(String parkname) {
	        this.parkname = parkname;
	    }

	    public String getParkzonename() {
	        return parkzonename;
	    }

	    public void setParkzonename(String parkzonename) {
	        this.parkzonename = parkzonename;
	    }
	}