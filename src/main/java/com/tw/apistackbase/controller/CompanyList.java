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

    public List<Company> getAllCompany(){
        return companyList;
    }

    public EmployeeList getAllEmployeesOfCompany(int id){
        for (Company tempCompany : companyList){
            if (tempCompany.getId()==id) {
                System.out.println("12321312");
                return tempCompany.getEmployees();
            }
        }
        return null;
    }

    public Company getSpecificCompany(int id){
        for (Company tempCompany : companyList){
            if (tempCompany.getId()==id) {
                return tempCompany;
            }
        }
        return null;
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
            if (tempCompany.getId()==id){
                companyList.remove(tempCompany);
            }
        }
    }

    public List<Company> getAllCompanyWithPage(String page, String pageSize){
        List<Company> companyListWithPage = new ArrayList<>();
        int pageInt = Integer.parseInt(page);
        int pageSizeInt = Integer.parseInt(pageSize);
        for (int index=pageInt*pageSizeInt; index<(pageInt+1)*pageSizeInt; index++)
            companyListWithPage.add(companyList.get(index));
        return companyListWithPage;
    }
}
