package com.streamapi;

import java.util.List;

public class Employee {
    private String FirstName;
    private String LastName;

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                '}';
    }

    public Employee(String firstName, String lastName, Double salary, List<String> project) {
        FirstName = firstName;
        LastName = lastName;
        this.salary = salary;
        this.project = project;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getProject() {
        return project;
    }

    public void setProject(List<String> project) {
        this.project = project;
    }

    private Double salary;
    private List<String> project;



}
