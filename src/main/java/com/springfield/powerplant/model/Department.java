package com.springfield.powerplant.model;

public enum Department {

    REACTOR_CONTROL, SECURITY, MAINTENANCE, ADMINISTRATION;

    private String deparment;

    Department() {
        this.deparment = deparment;
    }
    public String getDeparment() {
        return this.deparment;
    }
}
