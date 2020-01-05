package com.wan.jl.decorator;

public  abstract  class Decorator implements SchoolReport {

    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport){
        this.schoolReport = schoolReport;
    }


    public void report(){
        this.schoolReport.report();
    }

    public void sign(String name){
        this.schoolReport.sign(name);
    }
}
