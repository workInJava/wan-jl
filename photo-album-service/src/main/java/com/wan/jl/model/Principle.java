package com.wan.jl.model;

import java.text.NumberFormat;

public class Principle {

    public static void main(String[] args){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println(format.format(100/100.0));
    }
}
