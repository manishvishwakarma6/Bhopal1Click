package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "populationstatistics")
public class PopulationStatisticsModel {

    @Id
    private int statisticid;

    @Column(nullable = false)
    private long populationcount;

    @Column(nullable = false)
    private String daterecorded;

    // Constructors
    public PopulationStatisticsModel() {}

    public PopulationStatisticsModel(int statisticid, long populationcount, String daterecorded) {
        this.statisticid = statisticid;
        this.populationcount = populationcount;
        this.daterecorded = daterecorded;
    }

    // Getters and Setters
    public int getStatisticid() {
        return statisticid;
    }

    public void setStatisticid(int statisticid) {
        this.statisticid = statisticid;
    }

    public long getPopulationcount() {
        return populationcount;
    }

    public void setPopulationcount(long populationcount) {
        this.populationcount = populationcount;
    }

    public String getDaterecorded() {
        return daterecorded;
    }

    public void setDaterecorded(String daterecorded) {
        this.daterecorded = daterecorded;
    }
}
