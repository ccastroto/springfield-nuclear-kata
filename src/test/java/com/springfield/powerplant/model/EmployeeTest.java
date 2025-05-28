package com.springfield.powerplant.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() {
        employee = new Employee("Homer Simpson", 1, Department.REACTOR_CONTROL,
                ExperienceLevel.NOVATO, Shift.MORNING);
    }

    @Test
    public void testEmployee() {
        assertEquals( "Homer Simpson", employee.getName());
    }
    @Test
    public void testSetID() {
        assertEquals(1, employee.getId());
    }
    @Test
    public void testDepartment() {
        assertEquals(Department.REACTOR_CONTROL, employee.getDepartment());
    }
    @Test
    public void testExperienceLevel() {
        assertEquals(ExperienceLevel.NOVATO, employee.getExperienceLevel());
    }
    @Test
    public void testShift() {
        assertEquals(Shift.MORNING, employee.getShift());
    }
}
