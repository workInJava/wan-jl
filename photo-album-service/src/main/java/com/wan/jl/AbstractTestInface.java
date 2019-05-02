package com.wan.jl;

public abstract class AbstractTestInface implements TestInface {

    @Override
    public void test1(){
        System.out.println("sbstract test1");
    }

    protected  Integer ret(){
        return 23;
    }
}
