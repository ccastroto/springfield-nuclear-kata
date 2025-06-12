package com.springfield.powerplant.service;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

import java.util.*;


public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private List<Employee> employees;

    public EmployeeManagementServiceImpl() {
        this.employees = new ArrayList<>();
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
            Employee empleado = new Employee(name, id, department, experienceLevel, shift);
            this.employees.add(empleado);
            System.out.println(empleado);
            return empleado;
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
    public void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel experience) {
         this.employees.stream()
                .filter(e -> e.equals(employee))
                .findFirst()
                .ifPresent(e -> e.setExperienceLevel(experience));

    }

    @Override
    public Map<String, Long> getExperienceLevelStatistics() {
        Map<String, Long> experienceStats = new HashMap<>();
        for (Employee e : employees) {
            String level = e.getExperienceLevel().toString();
            experienceStats.put(level, experienceStats.getOrDefault(level, 0L) + 1);
        }
        return experienceStats;
    }

    @Override
    public boolean isDepartmentFullyCovered(Department department) {
        Set<Shift> checkShifs = EnumSet.allOf(Shift.class);
        Set<Shift> shifts = new HashSet<>();

        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                shifts.add(employee.getShift());
            }
        }
        return shifts.containsAll(checkShifs);
    }

}
