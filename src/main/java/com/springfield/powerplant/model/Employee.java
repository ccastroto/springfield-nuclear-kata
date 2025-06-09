package com.springfield.powerplant.model;

public class Employee  {

    private final String name;
    private int id = 0;
    private final Department department;
    private final ExperienceLevel experienceLevel;
    private final Shift shift;

    enum department{}
    enum shift{}
    enum experienceLevel{}

    public Employee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.experienceLevel = experienceLevel;
        this.shift = shift;
    }

    public String getName() {
        return this.name;
    }
    public int getId() {
        if(this.id == 0){
            return this.id;
        }else {
            return this.id;
        }
    }
    public Department getDepartment() {
        return this.department;
    }
    public ExperienceLevel getExperienceLevel() {
        return this.experienceLevel;
    }
    public Shift getShift() {
        return this.shift;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        experienceLevel = this.experienceLevel;
    }

    public String toString() {
        return this.name + "(ID:" + getId() + ", "
                + "Nivel:" + getExperienceLevel() +  ", "
                + "Turno:" + getShift() +  ")" + "\n";
    }

}
