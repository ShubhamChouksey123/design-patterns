package com.shubham.app.structural.proxy.service;

import com.shubham.app.structural.proxy.entity.Employee;
import com.shubham.app.structural.proxy.entity.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {

    List<Employee> employees = new ArrayList<>();

    public EmployeeDetailsDaoImpl() {
        this.employees = new ArrayList<>();
        Employee employee = new Employee(10, "Shubham", 19, Role.ADMIN);
        employees.add(employee);
    }

    @Override
    public Employee getEmployee(Role role, Integer empId) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getEmployeeId(), empId)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void updateEmployeeSalary(Role role, Integer empId, Integer newSalary) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getEmployeeId(), empId)) {
                employee.setSalary(newSalary);
            }
        }
    }
}
