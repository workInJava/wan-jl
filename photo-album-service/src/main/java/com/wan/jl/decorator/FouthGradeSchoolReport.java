package com.wan.jl.decorator;

public class FouthGradeSchoolReport implements SchoolReport {


    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println("...............");
        System.out.println("语文：62，数学：65，体育：98，自然：63");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名："+name);
    }
}
