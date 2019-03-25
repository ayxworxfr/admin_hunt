package com.worxfr.service.Impl;

import com.worxfr.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {


        ApplicationContext context= new AnnotationConfigApplicationContext(Scan.class);
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        System.out.println(bean.login(new User()));


    }
}
