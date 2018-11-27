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
@RequestMapping("/companies")
public class CompanyController {

    CompanyList companyList;
    @Autowired
    public CompanyController(CompanyList companyList){
        this.companyList = companyList;
    }

    @GetMapping( produces = {"application/json"})
    public ResponseEntity<Object> getCompany(){
        return ResponseEntity.ok(companyList.getAllCompany());
    }

    @PostMapping( produces ={"application/json"})
    public void addCompany(@RequestBody Company company) {
        companyList.addCompany(company);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyCompany(@PathVariable int id, @RequestBody Company company){
        companyList.putCompany(company, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCompany(@PathVariable int id, @RequestBody Company company){
        companyList.deleteCompany(company,id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Company> getSpecificCompany(@PathVariable int id){
        return ResponseEntity.ok(companyList.getSpecificCompany(id));
    }

    @RequestMapping(value = "/{id}/employees", method = RequestMethod.GET)
    public ResponseEntity<EmployeeList> getAllEmployeesOfCompany(@PathVariable int id){
        return ResponseEntity.ok(companyList.getAllEmployeesOfCompany(id));
    }

    public ResponseEntity<Object> getCompany(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize){
        return ResponseEntity.ok(companyList.getAllCompanyWithPage(page, pageSize));
    }
}
