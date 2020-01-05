package com.wan.jl.decorator;

public class SortDecorator extends Decorator {


    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void sort(){
        System.out.println("我排名第38名。。");
    }

    public void report(){
        super.report();
        this.sort();
    }
}
