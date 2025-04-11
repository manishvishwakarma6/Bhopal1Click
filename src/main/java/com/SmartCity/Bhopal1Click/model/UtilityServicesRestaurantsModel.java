package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "utilityservicesrestaurants")
public class UtilityServicesRestaurantsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurantid")
    private int restaurantid;

    @Column(name = "restaurantname", nullable = false)
    private String restaurantname;

    @Column(name = "restaurantstatus", nullable = false)
    private String restaurantstatus;

    @Column(name = "restaurentcontactno")
    private Long restaurentcontactno;

    @Column(name = "restaurantzonename", nullable = false)
    private String restaurantzonename;

    // Constructors
    public UtilityServicesRestaurantsModel() {
    }

    public UtilityServicesRestaurantsModel(int restaurantid, String restaurantname, String restaurantstatus, Long restaurentcontactno, String restaurantzonename) {
        this.restaurantid = restaurantid;
        this.restaurantname = restaurantname;
        this.restaurantstatus = restaurantstatus;
        this.restaurentcontactno = restaurentcontactno;
        this.restaurantzonename = restaurantzonename;
    }

    // Getters and Setters
    public int getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(int restaurantid) {
        this.restaurantid = restaurantid;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getRestaurantstatus() {
        return restaurantstatus;
    }

    public void setRestaurantstatus(String restaurantstatus) {
        this.restaurantstatus = restaurantstatus;
    }

    public Long getRestaurentcontactno() {
        return restaurentcontactno;
    }

    public void setRestaurentcontactno(Long restaurentcontactno) {
        this.restaurentcontactno = restaurentcontactno;
    }

    public String getRestaurantzonename() {
        return restaurantzonename;
    }

    public void setRestaurantzonename(String restaurantzonename) {
        this.restaurantzonename = restaurantzonename;
    }
}
