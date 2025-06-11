package com.springfield.powerplant.model;

import java.util.Objects;

public class Employee  {

    private String name;
    private final int id;
    private Department department;
    private ExperienceLevel experienceLevel;
    private Shift shift;

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
        return this.id;
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

    public void setExperienceLevel(ExperienceLevel experience) {
        this.experienceLevel = experience;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    public String toString() {
        return this.name + "(ID:" + getId() + ", "
                + "Nivel:" + getExperienceLevel() +  ", "
                + "Turno:" + getShift() +  ")" + "\n";
    }

}
