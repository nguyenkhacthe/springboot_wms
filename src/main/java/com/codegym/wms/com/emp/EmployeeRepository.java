package com.codegym.wms.com.emp;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {
    Iterable<Employee> findAllByEmpNameContaining(String name);

    Employee findTopByOrderByEmpIdDesc();
}
