package com.wan.jl.proxy;


import java.lang.reflect.InvocationHandler;

public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Class<?>[] classes = subject.getClass().getInterfaces();
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),classes,handler);
        proxy.doSomething("干事情了");


        Subject proxy1 = DynamicProxy.newProxyInstance(new RealSubject());
        proxy1.doSomething("第二次干");
    }
}
