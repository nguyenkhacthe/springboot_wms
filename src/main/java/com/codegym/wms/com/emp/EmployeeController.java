package com.codegym.wms.com.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public ResponseEntity<Iterable<Employee>> getAllEmp() {
        Iterable<Employee> employeeIterable = employeeService.findAll();
        return new ResponseEntity<Iterable<Employee>>(employeeIterable, HttpStatus.OK);
    }
}
