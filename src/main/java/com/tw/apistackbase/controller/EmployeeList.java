package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
        for (PersonalInfo person : employeeList){
            if (person.getId()==id){
                employeeList.remove(person);
                employeeList.add(personalInfo);
            }
        }
    }

    public void deleteEmployee(PersonalInfo personalInfo, int id){
        for (PersonalInfo person : employeeList){
            if (person.getId()==id){
                employeeList.remove(person);
            }
        }
    }

    public List<PersonalInfo> getAllEmployeeIsMale(){
        List<PersonalInfo> maleEmployeeList = new ArrayList<>();
        for (PersonalInfo person : employeeList){
            if (person.getGender().equals("male")){
                maleEmployeeList.add(person);
            }
        }
        return maleEmployeeList;
    }

    public List<PersonalInfo> getAllEmployeeWithPage(String page, String pageSize){
        List<PersonalInfo> employeeListWithPage = new ArrayList<>();
        int pageInt = Integer.parseInt(page);
        int pageSizeInt = Integer.parseInt(pageSize);
        for (int index=pageInt*pageSizeInt; index<(pageInt+1)*pageSizeInt; index++)
            employeeListWithPage.add(employeeList.get(index));

        return employeeListWithPage;
    }
}
