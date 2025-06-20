package com.springfield.powerplant.model;

import com.springfield.powerplant.service.EmployeeManagementServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.*;

public class EmployeeManagementServiceTest {

    private EmployeeManagementServiceImpl employeeManagementService;
    private Employee empCarl;
    private Employee empBurns;

    @Before
    public void setUp() {
        empBurns = new Employee("Sr Burns", 5, Department.ADMINISTRATION,
                ExperienceLevel.EXPERTO, Shift.MORNING);
        empCarl = new Employee("Carl Carlson", 3, Department.MAINTENANCE,
                ExperienceLevel.INTERMEDIO, Shift.NIGHT);
        List<Employee> employees = List.of(empBurns, empCarl);
        employeeManagementService = new EmployeeManagementServiceImpl();
        employeeManagementService.setEmployees(employees);
    }

    @Test
    public void createEmployeeTest() {
        assertNotNull(empBurns);
        assertEquals("Sr Burns", empBurns.getName());
        assertEquals(Department.ADMINISTRATION, empBurns.getDepartment());
        assertEquals(ExperienceLevel.EXPERTO, empBurns.getExperienceLevel());
        assertEquals(Shift.MORNING, empBurns.getShift());
        assertEquals(Employee.class, empBurns.getClass());
    }
    @Test
    public void findEmployeeTest() {
        List<Employee> result = employeeManagementService.findEmployeesByDepartment(Department.ADMINISTRATION);

        assertEquals(1, result.size());
        assertTrue(result.contains(empBurns));
    }
    /* // caso test findEmployee sin Before
    @Test
    public void findEmployeTest(){
    // Arange
    Employee empBurns = new Employee("Sr Burns", 5, Department.ADMINISTRATION,
           ExperienceLevel.EXPERTO, Shift.MORNING);
    Employee empCarl = new Employee("Carl Carlson", 3, Department.MAINTENANCE,
           ExperienceLevel.INTERMEDIO, Shift.NIGHT);
    List<Employee> employees = List.of(empBurns, empCarl);
    employeeManagementService = new EmployeeManagementServiceImpl()
    employeeManagementService.setEmployees(employees);
    // Act
    List<Employee> result = employeeManagementService.findEmployeesByDepartment(Department.ADMINISTRATION);
    //Assert
    assertEquals(1, result.size());
    assertTrue(result.contains(empBurns));
    }
    */
    @Test
    public void changeExperienceLevelTest() {
        employeeManagementService.changeEmployeeExperienceLevel(empCarl, ExperienceLevel.EXPERTO);

        assertEquals(ExperienceLevel.EXPERTO, empCarl.getExperienceLevel());
        assertTrue(empCarl.getExperienceLevel() == ExperienceLevel.EXPERTO);
    }

    @Test
    public void getExperienceLevelStatiticsTest() {
        Map<String, Long> experienceStats = employeeManagementService.getExperienceLevelStatistics();
        String level = empBurns.getExperienceLevel().toString();
        Long count = experienceStats.getOrDefault(level, 0L);

        assertTrue(experienceStats.containsKey(level));
        assertTrue(experienceStats.get(level) >= 1);
        assertEquals("EXPERTO",  level);
        assertEquals(Long.valueOf(1L), count);
    }
    @Test
    public void isDepartmentFullyCovered(){
        employeeManagementService.isDepartmentFullyCovered(Department.ADMINISTRATION);

        assertFalse(employeeManagementService.isDepartmentFullyCovered(Department.ADMINISTRATION));
        assertEquals(employeeManagementService.isDepartmentFullyCovered(Department.REACTOR_CONTROL), false);
    }
}
