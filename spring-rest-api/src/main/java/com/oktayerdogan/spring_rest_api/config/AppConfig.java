package com.oktayerdogan.spring_rest_api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oktayerdogan.spring_rest_api.model.Employee;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","oktay","erdogan"));
        employeeList.add(new Employee("2","oya nur","kiraz"));
        employeeList.add(new Employee("3","kutay","erdogan"));
        employeeList.add(new Employee("4","emirhan","erdogan"));
        employeeList.add(new Employee("5","hülya","erdogan"));
        employeeList.add(new Employee("6","mustafa","erdogan"));

        return employeeList;
    }
}
