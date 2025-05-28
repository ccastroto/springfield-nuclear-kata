package com.springfield.powerplant.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExperienceLevelTest {

    private ExperienceLevel experienceLevel;

    @Test
    public void experienceLevelTest() {
        ExperienceLevel experienceLevel = ExperienceLevel.NOVATO;
        assertEquals(experienceLevel, ExperienceLevel.NOVATO);
    }

    @Test
    public void experienceLevelNotTest() {
        ExperienceLevel experienceLevel = ExperienceLevel.NOVATO;
        assertNotEquals(experienceLevel, ExperienceLevel.EXPERTO);
    }
}
