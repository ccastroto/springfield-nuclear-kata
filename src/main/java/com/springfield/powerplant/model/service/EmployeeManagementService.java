package com.springfield.powerplant.model.service;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

import java.util.List;

public interface EmployeeManagementService {

    Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift);

    Object crewSize();

    void listCrew();

    List<Employee> findEmployeesByDepartment(Department department);
}
