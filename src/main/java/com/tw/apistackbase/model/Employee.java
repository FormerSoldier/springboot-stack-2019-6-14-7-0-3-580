package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;


    public static List<Employee> createTestEmployees(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(0,"Xiaoming",20,"Male"));
        employees.add(new Employee(1,"Xiaohong",19,"Female"));
        employees.add(new Employee(2,"Xiaozhi",15,"Male"));
        employees.add(new Employee(3,"Xiaogang",16,"Male"));
        employees.add(new Employee(4,"Xiaoxia",15,"Female"));

        return employees;
    }



    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
