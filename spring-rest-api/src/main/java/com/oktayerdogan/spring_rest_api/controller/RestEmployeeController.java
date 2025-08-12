package com.oktayerdogan.spring_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oktayerdogan.spring_rest_api.model.Employee;
import com.oktayerdogan.spring_rest_api.service.EmployeeService;

@RestController
@RequestMapping("/rest/api") //Bütün meyodların ortak kök adresi            http linklerinin hepsinin başında /rest/api olacak
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeeList(){

       return employeeService.getAllEmployeeList();
    }
}
