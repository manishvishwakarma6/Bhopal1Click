package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class PlayerModel {

    @Id
    private int playerid;

    @Column(nullable = false)
    private String sporttype;

    @Column(nullable = false)
    private String playername;

    @Column(nullable = false)
    private String playerzonename;

    // Getters and Setters
    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public String getSporttype() {
        return sporttype;
    }

    public void setSporttype(String sporttype) {
        this.sporttype = sporttype;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getPlayerzonename() {
        return playerzonename;
    }

    public void setPlayerzonename(String playerzonename) {
        this.playerzonename = playerzonename;
    }
}
