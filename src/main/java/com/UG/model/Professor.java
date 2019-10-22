package com.UG.model;

public class Professor {
    private int idProf;
    private String lastName;
    private String firstName;
    private String email;
    private String Title;
    private String phoneNumber;
    private int yearOfEmployment;
    private boolean active;
    private String[] courses;

    public Professor(int idProf, String lastName, String firstName,
                     String email, String title, String phoneNumber,
                     int yearOfEmployment, boolean active) {
        this.idProf = idProf;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.Title = title;
        this.phoneNumber = phoneNumber;
        this.yearOfEmployment = yearOfEmployment;
        this.active = active;
    }

    public int getIdProf() {
        return idProf;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return Title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public boolean isActive() {
        return active;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(Titles title) {
        title = title;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
