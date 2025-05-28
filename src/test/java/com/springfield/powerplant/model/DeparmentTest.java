package com.springfield.powerplant.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeparmentTest {

    private Department department;

    @Test
    public void testDeparment() {
        Department department = Department.SECURITY;
        assertEquals(department, Department.SECURITY);
    }
    @Test
    public void testSetDepartment() {
        Department department = Department.ADMINISTRATION;
        assertEquals(department, Department.ADMINISTRATION);
    }
}
