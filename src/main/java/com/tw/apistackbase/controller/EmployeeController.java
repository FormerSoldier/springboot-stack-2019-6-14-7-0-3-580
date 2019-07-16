package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees(){
        return Employee.createTestEmployees();
    }
    @PostMapping
    public List<Employee> addEmployee(@RequestBody Employee employee){
        List<Employee> employees = Employee.createTestEmployees();
        employees.add(employee);
        return employees;
    }

    @DeleteMapping("/{id}")
    public List<Employee> deleteEmployeeById(@PathVariable int id){
        List<Employee> employees = Employee.createTestEmployees();
        employees.remove(id);
        return employees;
    }

    @PutMapping
    public List<Employee> updateEmployee(@RequestBody Employee employee){
        List<Employee> employees = Employee.createTestEmployees();
        employees.set(employee.getId(),employee);
        return employees;
    }

}
