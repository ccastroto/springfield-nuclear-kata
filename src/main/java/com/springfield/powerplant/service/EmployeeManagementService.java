package com.springfield.powerplant.service;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

import java.util.List;
import java.util.Map;

public interface EmployeeManagementService {

    Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift);

    Object crewSize();

    void listCrew();

    List<Employee> findEmployeesByDepartment(Department department);

    void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel experienceLevel);

    Map<String, Long> getExperienceLevelStatistics();

    boolean isDepartmentFullyCovered(Department department);
}
