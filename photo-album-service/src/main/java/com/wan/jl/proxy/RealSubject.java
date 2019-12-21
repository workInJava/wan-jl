package com.wan.jl.proxy;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething---->"+str);
    }
}
