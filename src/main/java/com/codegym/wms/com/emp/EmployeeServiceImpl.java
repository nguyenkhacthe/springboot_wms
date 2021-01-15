package com.codegym.wms.com.emp;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    //region SEARCH
    @Override
    public Iterable<Employee> findAll() {
        try {
            Iterable<Employee> employeeIterable = employeeRepository.findAll();
            if(Lists.newArrayList(employeeIterable).size() == 0) {
                return null;
            } else {
                return employeeIterable;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Iterable<Employee> findAllByNameContaining(String name)  {
        try {
            return employeeRepository.findAllByEmpNameContaining(name);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public Employee findById(String id) {
        if(employeeRepository.findById(id).isPresent()) {
            return employeeRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public Employee findByMaxId() {
        try {
            return employeeRepository.findTopByOrderByEmpIdDesc();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    //endregion

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }



    @Override
    public void remove(Employee object) {

    }




}
