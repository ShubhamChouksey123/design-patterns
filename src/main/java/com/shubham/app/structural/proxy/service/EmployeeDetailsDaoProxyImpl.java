package com.shubham.app.structural.proxy.service;

import com.shubham.app.structural.proxy.entity.Employee;
import com.shubham.app.structural.proxy.entity.Role;

import java.util.Objects;

public class EmployeeDetailsDaoProxyImpl implements EmployeeDetailsDao {

    private EmployeeDetailsDaoImpl employeeDetailsDaoImpl;

    public EmployeeDetailsDaoProxyImpl() {
        this.employeeDetailsDaoImpl = new EmployeeDetailsDaoImpl();
    }

    @Override
    public Employee getEmployee(Role role, Integer empId) throws Exception {

        if (Objects.equals(role, Role.ADMIN)) {
            return employeeDetailsDaoImpl.getEmployee(role, empId);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void updateEmployeeSalary(Role role, Integer empId, Integer newSalary) throws Exception {
        if (Objects.equals(role, Role.ADMIN)) {
            employeeDetailsDaoImpl.updateEmployeeSalary(role, empId, newSalary);
            return;
        }
        throw new Exception("Access Denied");
    }
}
