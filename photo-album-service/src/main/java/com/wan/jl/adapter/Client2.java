package com.wan.jl.adapter;

public class Client2 {

    public  static void main(String[] args){
        Target target = new ConcreteTarget();
        target.request();
        Target target2 = new Adapter();
        target2.request();
    }
}
