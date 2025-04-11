package com.SmartCity.Bhopal1Click.model;

import jakarta.persistence.*;

@Entity
@Table(name = "educationcourses")
public class EducationCourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseid;

    @Column(nullable = false, length = 50)
    private String coursetype;

    @Column(nullable = false)
    private String coursename;

    @Column(nullable = false)
    private String courseduration;

    @Column(nullable = false)
    private String courseaveragefee;

    // Getters and Setters
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(String courseduration) {
        this.courseduration = courseduration;
    }

    public String getCourseaveragefee() {
        return courseaveragefee;
    }

    public void setCourseaveragefee(String courseaveragefee) {
        this.courseaveragefee = courseaveragefee;
    }
}
