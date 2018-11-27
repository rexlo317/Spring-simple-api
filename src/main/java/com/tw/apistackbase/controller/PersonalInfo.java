package com.tw.apistackbase.controller;


public class PersonalInfo {
    private String name;
    private int age;
    private int id;
    private String gender;
    private int salary;

    public PersonalInfo(){}

    public PersonalInfo(String name, int age, String gender, int id, int salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
