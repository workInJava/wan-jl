package com.wan.jl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLookUp {

    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Car car = (Car)ac.getBean("car");
//        Taxi taxi1 = car.getInstance();
//        Taxi taxi2 = car.getInstance();
       // System.out.println(taxi1==taxi2);

        System.out.println(car.getTaxi()==car.getTaxi());

    }
}
