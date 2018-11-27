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
/*
@RestController
@PostMapping({"application/json"})
public class EmployeeController {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    @PostMapping(path = "/{userName}/{age}/{gender}")
    public void addEmployee(@PathVariable String userName, @PathVariable int age, @PathVariable String gender, @PathVariable int id, EmployeeList employeeList) {
        employeeList.addEmployee(new PersonalInfo(userName, age, gender, id));
    }
}
*/
@RestController
@RequestMapping("/getemployees")
class getEmployee {

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<Object> getEmployee(){
        EmployeeList employeeList = new EmployeeList();
        return ResponseEntity.ok(employeeList.getAllEmployee());
    }
}