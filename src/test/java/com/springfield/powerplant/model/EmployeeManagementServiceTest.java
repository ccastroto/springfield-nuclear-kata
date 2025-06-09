package com.springfield.powerplant.model;

import com.springfield.powerplant.service.EmployeeManagementServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagementServiceTest {

    private EmployeeManagementServiceImpl employeeManagementService;

    @Test
    public void createEmployee() {
        Employee createEmployee = new Employee("Sr Burns", 5, Department.ADMINISTRATION,
                ExperienceLevel.EXPERTO, Shift.MORNING);
        assertNotNull(createEmployee);
        assertEquals("Sr Burns", createEmployee.getName());
        assertEquals(Department.ADMINISTRATION, createEmployee.getDepartment());
        assertEquals(ExperienceLevel.EXPERTO, createEmployee.getExperienceLevel());
        assertEquals(Shift.MORNING, createEmployee.getShift());
        assertEquals(Employee.class, createEmployee.getClass());
    }
}
