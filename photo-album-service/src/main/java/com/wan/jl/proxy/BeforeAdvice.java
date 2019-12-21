package com.wan.jl.proxy;


public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置，我被执行了");
    }
}
