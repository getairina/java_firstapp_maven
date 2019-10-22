package com.UG.model;

public class Courses {
    private int idCourse;
    private String name;
    private String shortName;
    private String details;
    private Professor profesor;

    public Courses(String nume, String prescurtare, String detalii, Professor profesor){
        this.idCourse = idCourse;
        this.name = name;
        this.shortName = shortName;
        this.details = details;
        this.profesor = profesor;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Professor getProfesor() {
        return profesor;
    }

    public void setProfesor(Professor profesor) {
        this.profesor = profesor;
    }
}
