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

    @GetMapping( produces = {"application/json"})
    public ResponseEntity<Object> getEmployee(){
        return ResponseEntity.ok(employeeList.getAllEmployee());
    }

    @PostMapping( produces ={"application/json"})
    public void addEmployee(@RequestBody PersonalInfo personalInfo) {
        employeeList.addEmployee(personalInfo);
    }

/*    @PutMapping(path = "/id", produces = {"application/json"})
    public void modifyEmployee(@RequestBody PersonalInfo personalInfo){
        //employeeList.putEmployee(personalInfo);
    }
    */
}
