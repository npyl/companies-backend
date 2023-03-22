package org.npyl.companiesbackend.controller;

import org.npyl.companiesbackend.entity.Company;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RESTController {
    @GetMapping("/companies-list")
    public List<Company> getCompaniesList()
    {
        List<Company> list = new ArrayList<>(2);

        list.add(new Company("Digipath"));
        list.add(new Company("Digipath2"));

        return list;
    }
}
