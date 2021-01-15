package com.codegym.wms.com.emp;

import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    Iterable<Employee> findAll();
}
