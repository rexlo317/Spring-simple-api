package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.Option;
import java.util.*;

@Service
public class CompanyList {
    private List<Company> companyList = new ArrayList<>();
    public CompanyList(){
    }

    public void addCompany(Company company){ companyList.add(company);
    }

    public void deleteCompany(Company company){
        companyList.remove(company.getId());
    }

    public List<Company> getAllComapny(){
        return companyList;
    }

    public void putCompany(Company company, int id){
        for (Company tempCompany : companyList){
            if (company.getId()==id){
                companyList.remove(tempCompany);
                companyList.add(company);
            }
        }
    }

    public void deleteCompany(Company company, int id){
        for (Company tempCompany : companyList){
            if (company.getId()==id){
                companyList.remove(tempCompany);
            }
        }
    }

}
