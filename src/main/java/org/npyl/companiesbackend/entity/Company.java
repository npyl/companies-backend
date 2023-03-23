package org.npyl.companiesbackend.entity;

public class Company {
    private String name;                // INFO: name will be ID

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
