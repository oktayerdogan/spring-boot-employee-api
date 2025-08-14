package com.oktayerdogan.spring_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oktayerdogan.spring_rest_api.model.Employee;
import com.oktayerdogan.spring_rest_api.service.EmployeeService;

@RestController
@RequestMapping("/rest/api/employee") //Bütün meyodların ortak kök adresi            http linklerinin hepsinin başında /rest/api olacak
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList(){

       return employeeService.getAllEmployeeList();
    }
    @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id" , required = true) String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeesWithParams(@RequestParam(name = "firstName",required = false) String firstName, @RequestParam(name = "lastName",required = false) String lastName){
        return employeeService.getEmployeesWithParams(firstName, lastName);
    }

    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping(path = "/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id")String id){

        return employeeService.deleteEmployee(id);
    }
}
