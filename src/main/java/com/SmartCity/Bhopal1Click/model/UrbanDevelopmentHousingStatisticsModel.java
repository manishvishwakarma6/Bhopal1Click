package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "urbandevelopmenthousingstatistics")
public class UrbanDevelopmentHousingStatisticsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int housingstatisticid;

    private String housingstatistichousename;
    private int housingstatisticvacanthouses;
    private String housingstatisticaverageprice;
    private String housingstatisticzonename;

    // Constructors
    public UrbanDevelopmentHousingStatisticsModel() {}

    public UrbanDevelopmentHousingStatisticsModel(int housingstatisticid, String housingstatistichousename, int housingstatisticvacanthouses, String housingstatisticaverageprice, String housingstatisticzonename) {
        this.housingstatisticid = housingstatisticid;
        this.housingstatistichousename = housingstatistichousename;
        this.housingstatisticvacanthouses = housingstatisticvacanthouses;
        this.housingstatisticaverageprice = housingstatisticaverageprice;
        this.housingstatisticzonename = housingstatisticzonename;
    }

    // Getters and Setters
    public int getHousingstatisticid() {
        return housingstatisticid;
    }

    public void setHousingstatisticid(int housingstatisticid) {
        this.housingstatisticid = housingstatisticid;
    }

    public String getHousingstatistichousename() {
        return housingstatistichousename;
    }

    public void setHousingstatistichousename(String housingstatistichousename) {
        this.housingstatistichousename = housingstatistichousename;
    }

    public int getHousingstatisticvacanthouses() {
        return housingstatisticvacanthouses;
    }

    public void setHousingstatisticvacanthouses(int housingstatisticvacanthouses) {
        this.housingstatisticvacanthouses = housingstatisticvacanthouses;
    }

    public String getHousingstatisticaverageprice() {
        return housingstatisticaverageprice;
    }

    public void setHousingstatisticaverageprice(String housingstatisticaverageprice) {
        this.housingstatisticaverageprice = housingstatisticaverageprice;
    }

    public String getHousingstatisticzonename() {
        return housingstatisticzonename;
    }

    public void setHousingstatisticzonename(String housingstatisticzonename) {
        this.housingstatisticzonename = housingstatisticzonename;
    }
}
