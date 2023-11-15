package com.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype(){
        Employee eko = applicationContext.getBean("employeeManager", Employee.class);
        eko.setName("eko");
        Employee budi = applicationContext.getBean("employeeStaff", Employee.class);
        budi.setName("budi");
        Employee joko = applicationContext.getBean("employeeStaff", Employee.class);
        joko.setName("joko");

        System.out.println(eko);
        System.out.println(budi);
        System.out.println(joko);
    }

}
