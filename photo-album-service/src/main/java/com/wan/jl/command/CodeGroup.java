package com.wan.jl.command;

public class CodeGroup implements Group {

    @Override
    public void find() {
        System.out.println("CodeGrop find");
    }

    @Override
    public void add() {
        System.out.println("CodeGrop add");
    }

    @Override
    public void delete() {
        System.out.println("CodeGrop delete");
    }

    @Override
    public void change() {
        System.out.println("CodeGrop change");
    }

    @Override
    public void plan() {
        System.out.println("CodeGrop plan");
    }
}
