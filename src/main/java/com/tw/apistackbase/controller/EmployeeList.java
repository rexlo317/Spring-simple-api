package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeList {
    private List<PersonalInfo> employeeList = new ArrayList<>();
    public EmployeeList(){
    }

    public void addEmployee(PersonalInfo personalInfo){
        employeeList.add(personalInfo);
    }

    public void deleteEmployee(PersonalInfo personalInfo){
        employeeList.remove(personalInfo.getId());
    }

    public List<PersonalInfo> getAllEmployee(){
        addEmployee(new PersonalInfo("Tom",15,"male", 1));
        addEmployee(new PersonalInfo("Tom",15,"male", 2));
        addEmployee(new PersonalInfo("Tom",15,"male", 3));
        return employeeList;
    }

    public void updateEmployee(){}
}
