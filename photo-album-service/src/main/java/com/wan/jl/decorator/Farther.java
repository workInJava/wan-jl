package com.wan.jl.decorator;

public class Farther {

    public static void main(String[] agrs){
        SchoolReport sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("李三");

    }
}
