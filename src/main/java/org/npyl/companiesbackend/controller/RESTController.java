package org.npyl.companiesbackend.controller;

import org.npyl.companiesbackend.api.NewEmployeeRequest;
import org.npyl.companiesbackend.api.NewEmployeeResponse;
import org.npyl.companiesbackend.entity.Company;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RESTController {

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

        return response;
    }
}
