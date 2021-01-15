package com.codegym.wms.com.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUtilities {
    @Autowired
    EmployeeService employeeService;
    protected String getEmpId() {
        Employee maxIdEmp = employeeService.findByMaxId();
        if (maxIdEmp == null) {
            return "CG00001";
        } else {
            String maxId = maxIdEmp.getEmpId();
            int newMaxIdNumber = Integer.parseInt(maxId.substring(maxId.length() - 5)) + 1;
            StringBuilder stringBuilder = new StringBuilder();
            while (stringBuilder.length() < 5 - String.valueOf(newMaxIdNumber).length()) {
                stringBuilder.append('0');
            } stringBuilder.append(newMaxIdNumber);
            return "CG" + stringBuilder.toString();
        }
    }
}
