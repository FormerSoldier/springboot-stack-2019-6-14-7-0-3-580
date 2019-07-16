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
    public int addEmployee(@RequestBody Employee employee){
        return employee.getId();
    }

    @DeleteMapping("/{id}")
    public List<Employee> deleteEmployeeById(@PathVariable int id){
        List<Employee> employees = Employee.createTestEmployees();
        employees.remove(id);
        return employees;
    }

}
