package com.wan.jl.command;

public class PageGroup implements Group {
    @Override
    public void find() {
        System.out.println("pageGroup find");
    }

    @Override
    public void add() {
        System.out.println("pageGroup add");
    }

    @Override
    public void delete() {
        System.out.println("pageGroup delete");
    }

    @Override
    public void change() {
        System.out.println("pageGroup change");
    }

    @Override
    public void plan() {
        System.out.println("pageGroup plan");
    }
}
