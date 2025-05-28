package com.springfield.powerplant.model;

public enum ExperienceLevel {
    NOVATO, INTERMEDIO ,EXPERTO;

    private String experienceLevel;

    ExperienceLevel() {
        this.experienceLevel = experienceLevel.toLowerCase();
    }
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

}
