package com.wan.jl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.util.StringUtils;

//@Data
//@EqualsAndHashCode
public class Hello extends AbstractTestInface {

    private String test = "we";

    @Override
    public void test2() {

    }

    @Override
    public void test1() {
        System.out.println("hello test1");
    }

    public void test3(){
        System.out.println("hello test3");
    }

    public void test4(){
        test3();
    }

    public static void main(String[] args){
        TestInface test = new Hello();
        test.test1();
        String[] er = StringUtils.tokenizeToStringArray("ww;e;we,a", ",;");
        for(String e:er){
            System.out.println(e);
        }

    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
