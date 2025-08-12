package com.oktayerdogan.spring_rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oktayerdogan.spring_rest_api.model.Employee;
import com.oktayerdogan.spring_rest_api.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){

        return employeeRepository.getAllEmployeeList();
    }

}
