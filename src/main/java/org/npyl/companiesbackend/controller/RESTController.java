package org.npyl.companiesbackend.controller;

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
    public String newEmployee(@RequestBody String body)
    {
        return body;
    }
}
