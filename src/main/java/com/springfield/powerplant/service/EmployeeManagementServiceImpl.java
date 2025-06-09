package com.springfield.powerplant.service;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private List<Employee> employees;

    public EmployeeManagementServiceImpl() {
        this.employees = new ArrayList<>();
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
            return employees.add(new Employee(name, id, department, experienceLevel, shift)) ? new Employee(name, id, department, experienceLevel, shift) : null;
    }
    @Override
    public Object crewSize() {
        return employees.size();
    }
    @Override
    public void listCrew() {
        List.of(employees).forEach(System.out::println);
    }

    @Override
   public List<Employee> findEmployeesByDepartment(Department department) {
        return employees.stream()
                .filter(
                employee -> employee.getDepartment()
                        .equals(department)).toList();
   }


    @Override
    public void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel experienceLevel) {
        this.employees.stream()
                .filter(e ->  e.getExperienceLevel().equals(experienceLevel))
                .findFirst()
                .ifPresent(e -> {
                    e.setExperienceLevel(experienceLevel.incrementExperienceLevel());
                });
    }



}
