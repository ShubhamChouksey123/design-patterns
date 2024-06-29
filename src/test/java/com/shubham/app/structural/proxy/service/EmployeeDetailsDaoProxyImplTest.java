package com.shubham.app.structural.proxy.service;

import org.junit.jupiter.api.Test;

import com.shubham.app.structural.proxy.entity.Role;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeDetailsDaoProxyImplTest {

    @Test
    void testEmployeeDetailsProxy() throws Exception {
        EmployeeDetailsDao elm = new EmployeeDetailsDaoProxyImpl();
        assertNotNull(elm.getEmployee(Role.ADMIN, 10));
    }

    @Test
    void testEmployeeDetailsProxy2() {
        EmployeeDetailsDao elm = new EmployeeDetailsDaoProxyImpl();

        assertThrows(Exception.class, () -> {
            elm.getEmployee(Role.USER, 10);
        });

        assertThrows(Exception.class, () -> {
            elm.getEmployee(Role.USER, 12);
        });
    }
}
