package com.springfield.powerplant.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftTest {

    private Shift shift;

    @Test
    public void testShift() {
        Shift shift = Shift.MORNING;
        assertEquals(shift, Shift.MORNING);
    }

    @Test
    public void testToString() {
        Shift shift = Shift.MORNING;
        assertEquals("MORNING", shift.toString());
    }
}
