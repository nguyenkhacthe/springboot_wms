package com.codegym.wms.com.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeUtilities employeeUtilities;
    @GetMapping
    public ResponseEntity<Iterable<Employee>> getAllEmp() {
        Iterable<Employee> employeeIterable = employeeService.findAll();
        return new ResponseEntity<>(employeeIterable, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") String id) {
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Void> insertEmployee(@RequestBody Employee employee, UriComponentsBuilder uriComponentsBuilder) {
        employee.setEmpId(employeeUtilities.getEmpId());
        employeeService.save(employee);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uriComponentsBuilder.path("/emp/{id}").buildAndExpand(employee.getEmpId()).toUri());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }
}
