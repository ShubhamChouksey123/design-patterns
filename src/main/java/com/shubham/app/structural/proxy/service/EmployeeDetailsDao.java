package com.shubham.app.structural.proxy.service;

import com.shubham.app.structural.proxy.entity.Employee;
import com.shubham.app.structural.proxy.entity.Role;

public interface EmployeeDetailsDao {
    Employee getEmployee(Role role, Integer empId) throws Exception;

    void updateEmployeeSalary(Role role, Integer empId, Integer newSalary) throws Exception;
}
