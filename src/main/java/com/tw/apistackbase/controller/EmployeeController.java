package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeList employeeList;
    @Autowired
    public EmployeeController(EmployeeList employeeList){
        this.employeeList = employeeList;
    }


    public ResponseEntity<Object> getEmployee(){
        return ResponseEntity.ok(employeeList.getAllEmployee());
    }
    @GetMapping( produces = {"application/json"})
    public ResponseEntity<Object> getEmployee(@RequestParam(name = "gender",  required = false) String gender,@RequestParam(name = "page", required = false) String page, @RequestParam(name = "pageSize", required = false)String pageSize){
        if(gender!=null && gender.equals("male"))
            return ResponseEntity.ok(employeeList.getAllEmployeeIsMale());
        else if(page!=null & pageSize!=null)
            return ResponseEntity.ok(employeeList.getAllEmployeeWithPage(page,pageSize));
        return ResponseEntity.ok(employeeList.getAllEmployee());
    }


    @PostMapping( produces ={"application/json"})
    public void addEmployee(@RequestBody PersonalInfo personalInfo) {
        employeeList.addEmployee(personalInfo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyEmployee(@PathVariable int id, @RequestBody PersonalInfo personalInfo){
        employeeList.putEmployee(personalInfo,id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable int id, @RequestBody PersonalInfo personalInfo){
        employeeList.deleteEmployee(personalInfo,id);
    }
}
