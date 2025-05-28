package com.springfield.powerplant.model.service;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private final List<Employee> employeService = new ArrayList<>();

    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
            return employeService.add(new Employee(name, id, department, experienceLevel, shift)) ? new Employee(name, id, department, experienceLevel, shift) : null;
    }
    public Object crewSize() {
        return employeService.size();
    }
    public void listCrew() {
        List.of(employeService).forEach(System.out::println);
    }
}
