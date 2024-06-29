package com.shubham.app.structural.proxy;

import com.shubham.app.structural.proxy.entity.Role;
import com.shubham.app.structural.proxy.service.EmployeeDetailsDao;
import com.shubham.app.structural.proxy.service.EmployeeDetailsDaoProxyImpl;

public class MainClass {

    public static void main(String[] args) throws Exception {
        EmployeeDetailsDao elm = new EmployeeDetailsDaoProxyImpl();
        elm.getEmployee(Role.ADMIN, 10);
    }
}
