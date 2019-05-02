package com.wan.jl.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApp {
//   public static void main(String[] args) throws IOException {
//      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//     // obj.getMessage();
//      context.start();
//      context.registerShutdownHook();
//
//
////      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/provider.xml"});
////      context.start();
//      System.in.read();
//   }


   public static void main(String[] args){
      System.out.println(Thread.currentThread().getContextClassLoader());
   }
}