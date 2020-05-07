package com.ds.javacode;

public class Customer {

    private String firstName;
    private String lastName;

    private boolean fullTimme;

    public Customer (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.fullTimme = true;

    }

    public Customer (String firstName, String lastName, boolean fullTime) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this (firstName,lastName);
        this.fullTimme = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isFullTimme() {
        return fullTimme;
    }

    public void setFullTimme(boolean fullTimme) {
        this.fullTimme = fullTimme;
    }
}
