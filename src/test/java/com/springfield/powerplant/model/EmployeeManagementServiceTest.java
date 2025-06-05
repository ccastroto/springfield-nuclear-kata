package com.springfield.powerplant.model;

import com.springfield.powerplant.service.EmployeeManagementServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagementServiceTest {

    private EmployeeManagementServiceImpl employeeManagementService;

    @Test
    public void createEmployee() {
        Employee createEmployee = new Employee("Homer Simpson", 1, Department.REACTOR_CONTROL,
                ExperienceLevel.NOVATO, Shift.MORNING);
        assertNotNull(createEmployee);
        assertEquals("Homer Simpson", createEmployee.getName());
        assertEquals(Department.REACTOR_CONTROL, createEmployee.getDepartment());
        assertEquals(ExperienceLevel.NOVATO, createEmployee.getExperienceLevel());
        assertEquals(Shift.MORNING, createEmployee.getShift());
    }

}
