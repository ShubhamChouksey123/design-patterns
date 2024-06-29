package com.shubham.app.structural.proxy.entity;

public class Employee {

    private Integer employeeId;
    private String name;
    private Integer salary;

    private Role role;

    public Employee(Integer employeeId, String name, Integer salary, Role role) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", name='" + name + '\'' + ", salary=" + salary + ", role="
                + role + '}';
    }
}
