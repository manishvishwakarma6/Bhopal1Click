package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "environmenttreeplantationdrives")
public class EnvironmentTreePlantationDriveModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "treeplantationdriveid")
    private int treeplantationdriveid;

    @Column(name = "treeplantationdrivename", nullable = false)
    private String treeplantationdrivename;

    @Column(name = "treeplantationdrivestatus", nullable = false)
    private String treeplantationdrivestatus;

    @Column(name = "treeplantationdrivezonename", nullable = false)
    private String treeplantationdrivezonename;

    // Constructors
    public EnvironmentTreePlantationDriveModel() {
    }

    public EnvironmentTreePlantationDriveModel(int treeplantationdriveid, String treeplantationdrivename, String treeplantationdrivestatus, String treeplantationdrivezonename) {
        this.treeplantationdriveid = treeplantationdriveid;
        this.treeplantationdrivename = treeplantationdrivename;
        this.treeplantationdrivestatus = treeplantationdrivestatus;
        this.treeplantationdrivezonename = treeplantationdrivezonename;
    }

    // Getters and Setters
    public int getTreeplantationdriveid() {
        return treeplantationdriveid;
    }

    public void setTreeplantationdriveid(int treeplantationdriveid) {
        this.treeplantationdriveid = treeplantationdriveid;
    }

    public String getTreeplantationdrivename() {
        return treeplantationdrivename;
    }

    public void setTreeplantationdrivename(String treeplantationdrivename) {
        this.treeplantationdrivename = treeplantationdrivename;
    }

    public String getTreeplantationdrivestatus() {
        return treeplantationdrivestatus;
    }

    public void setTreeplantationdrivestatus(String treeplantationdrivestatus) {
        this.treeplantationdrivestatus = treeplantationdrivestatus;
    }

    public String getTreeplantationdrivezonename() {
        return treeplantationdrivezonename;
    }

    public void setTreeplantationdrivezonename(String treeplantationdrivezonename) {
        this.treeplantationdrivezonename = treeplantationdrivezonename;
    }
}
