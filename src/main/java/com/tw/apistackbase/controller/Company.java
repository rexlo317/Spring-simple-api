package com.tw.apistackbase.controller;

public class Company {
    private String companyName;
    private int employeesNumber;
    private EmployeeList employees;
    private int id;

    public Company(){}

    public Company(String companyName, int employeesNumber, EmployeeList employees, int id){
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
        this.employees = employees;
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public EmployeeList getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeList employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}