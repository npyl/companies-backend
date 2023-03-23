package org.npyl.companiesbackend.business;

import org.npyl.companiesbackend.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHandler {
    private List<Employee> employees;

    public EmployeeHandler() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e)
    {
        this.employees.add(e);
    }

    public List<Employee> getEmployees()
    {
        return this.employees;
    }
}
