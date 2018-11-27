package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.*;

@Service
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
        return employeeList;
    }

    public void putEmployee(PersonalInfo personalInfo, int id){
        Optional<PersonalInfo> temp = employeeList.stream().filter(element -> element.getId()==id).findFirst();
        employeeList.remove(employeeList.indexOf(temp));
        employeeList.add(personalInfo);
    }

    public void deleteEmployee(PersonalInfo personalInfo, int id){
        Optional<PersonalInfo> temp = employeeList.stream().filter(element -> element.getId()==id).findFirst();
        employeeList.remove(employeeList.indexOf(temp));
    }

}
