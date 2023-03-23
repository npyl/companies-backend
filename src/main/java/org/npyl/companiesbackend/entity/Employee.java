package org.npyl.companiesbackend.entity;

public class Employee {

    public static int _id;
    private int id;

    private String name;
    private String company;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee(String name, String company) {
        this.name = name;
        this.company = company;

        // increment static id
        Employee._id = Employee._id + 1;
        // get our id
        this.id = Employee._id;

        this.role = "USER";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}