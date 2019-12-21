package com.wan.jl.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {

    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler handler){
        (new BeforeAdvice()).exec();
        return (T)Proxy.newProxyInstance(loader,interfaces,handler);
    }

    public static <T> T newProxyInstance(Subject subject){
        InvocationHandler handler = new MyInvocationHandler(subject);
        Class<?>[] cl = subject.getClass().getInterfaces();
        return newProxyInstance(subject.getClass().getClassLoader(),cl,handler);

    }
}
