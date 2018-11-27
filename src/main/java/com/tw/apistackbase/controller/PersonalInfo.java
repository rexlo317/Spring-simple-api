package com.tw.apistackbase.controller;


public class PersonalInfo {
    private String name;
    private int age;
    private int id;
    private String gender;

    public PersonalInfo(String name, int age, String gender, int id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
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

}
