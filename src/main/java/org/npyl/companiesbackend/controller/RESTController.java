package org.npyl.companiesbackend.controller;

import org.npyl.companiesbackend.api.request.NewEmployeeRequest;
import org.npyl.companiesbackend.api.response.NewEmployeeResponse;
import org.npyl.companiesbackend.business.EmployeeHandler;
import org.npyl.companiesbackend.entity.Company;
import org.npyl.companiesbackend.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RESTController {

    // TODO: singleton instance of business
    // TODO: this needs to exist inside a business class
    private EmployeeHandler employeeHandler;

    public RESTController()
    {
        this.employeeHandler = new EmployeeHandler();
    }

    @GetMapping("/companies-list")
    public List<Company> getCompaniesList()
    {
        List<Company> list = new ArrayList<>(2);

        list.add(new Company("Digipath"));
        list.add(new Company("Digipath2"));

        return list;
    }

    @PostMapping("/new-employee")
    public NewEmployeeResponse newEmployee(@RequestBody NewEmployeeRequest body)
    {
        System.out.println("name: " + body.getName() + " password: " + body.getPassword() + " company: " + body.getCompany());

        // TODO: mapper
        NewEmployeeResponse response = new NewEmployeeResponse(body.getName(), body.getCompany());
        // TODO: mapper
        Employee employee = new Employee(body.getName(), body.getCompany());

        // Add employee to our "DB"
        employeeHandler.addEmployee(employee);

        return response;
    }

    @GetMapping("/list-employees/{companyName}")
    public List<Employee> listEmployeesForCompany(@PathVariable String companyName)
    {
        if (companyName.isEmpty())
            return null;

        return this.employeeHandler.getEmployees()
                                    .stream()
                                    .filter(e -> e.getCompany().equals(companyName))
                                    .collect(Collectors.toList());
    }
}
