package com.codegym.wms.com.emp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {
    Employee findByEmpId(String empId);

    Iterable<Employee> findAllByEmpNameContaining(String name);



}
