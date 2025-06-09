package com.springfield.powerplant.model;

import com.springfield.powerplant.service.EmployeeManagementServiceImpl;
import org.junit.Test;

import java.util.List;

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
    @Test
    public void findEmployee() {
        Employee empBurns = new Employee("Sr Burns", 5, Department.ADMINISTRATION,
                ExperienceLevel.EXPERTO, Shift.MORNING);
        Employee empCarl = new Employee("Carl Carlson", 3, Department.MAINTENANCE,
                ExperienceLevel.INTERMEDIO, Shift.NIGHT);
        List<Employee> employees = List.of(empBurns, empCarl);
        employeeManagementService = new EmployeeManagementServiceImpl();
        employeeManagementService.setEmployees(employees);
        List<Employee> result = employeeManagementService.findEmployeesByDepartment(Department.ADMINISTRATION);

        assertEquals(1, result.size());
        assertTrue(result.contains(empBurns));
    }
}
