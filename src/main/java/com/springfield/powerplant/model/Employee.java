package com.springfield.powerplant.model;

public final class Employee {

    private String name;
    private int id = 0;
    private enum department{};
    private enum experienceLevel{};
    private enum shift{};

    Employee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = id;
        experienceLevel = experienceLevel;
        shift = shift;
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
    public Department getDepartment(Department department) {
        return Department.valueOf(department.name());
    }
    public ExperienceLevel getExperienceLevel(ExperienceLevel experienceLevel) {
        return experienceLevel.valueOf(experienceLevel.name());
    }
    public Shift getShift(Shift shift) {
        return shift.valueOf(shift.name());
    }

    public void SetExperienceLevel(ExperienceLevel experienceLevel) {
        experienceLevel = experienceLevel;
    }

    public String toString() {
        return this.name + "(ID:" + this.id + ", "
                + "Nivel:" +   ", "
                + "Turno:" +  ")";
    }

}
