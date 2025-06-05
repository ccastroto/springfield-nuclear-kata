package com.springfield.powerplant.model;

import com.springfield.powerplant.service.EmployeeManagementServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagementServiceTest {

    private Employee employee;

    @Test
    public void createEmployee() {
        assertNull(employee);
        employee = new Employee("Homer Simpson", 1, Department.REACTOR_CONTROL,
                ExperienceLevel.NOVATO, Shift.MORNING);
        assertNotNull(employee);
        assertEquals("Homer Simpson", employee.getName());
        assertEquals(Department.REACTOR_CONTROL, employee.getDepartment());
        assertEquals(ExperienceLevel.NOVATO, employee.getExperienceLevel());
        assertEquals(Shift.MORNING, employee.getShift());
    }
}
