package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicsafetysecuritycamera")
public class PublicSafetySecurityCameraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cameraipaddress")
    private int cameraIpAddress;

    @Column(name = "cameratype", nullable = false)
    private String cameraType;

    @Column(name = "cameraname", nullable = false)
    private String cameraName;

    @Column(name = "camerazonename", nullable = false)
    private String cameraZoneName;

    // Constructors
    public PublicSafetySecurityCameraModel() {}

    public PublicSafetySecurityCameraModel(int cameraIpAddress, String cameraType, String cameraName, String cameraZoneName) {
        this.cameraIpAddress = cameraIpAddress;
        this.cameraType = cameraType;
        this.cameraName = cameraName;
        this.cameraZoneName = cameraZoneName;
    }

    // Getters and Setters
    public int getCameraIpAddress() {
        return cameraIpAddress;
    }

    public void setCameraIpAddress(int cameraIpAddress) {
        this.cameraIpAddress = cameraIpAddress;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public String getCameraZoneName() {
        return cameraZoneName;
    }

    public void setCameraZoneName(String cameraZoneName) {
        this.cameraZoneName = cameraZoneName;
    }
}
