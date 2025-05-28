package com.springfield.powerplant.model;

final class Employee {

    private String name;
    private int id = 0;
    private String department;
    private String experienceLevel;
    private String shift;

    Employee(String name, int id, String department, String experienceLevel, String shift) {
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
    public String getDepartment() {
        return this.department;
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }
    public String getShift() {
        return this.shift;
    }

    public void SetExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String toString() {
        return this.name + "(ID:" + this.id + ", "
                + "Nivel:" + this.experienceLevel + ", "
                + "Turno:" + this.shift + ")";
    }

}
