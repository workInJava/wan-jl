package com.wan.jl.spring;

import lombok.Data;


@Data
public abstract class Car {

    private Taxi taxi;

    public Car(){
        System.out.println("Car is created.");
        //InputStream inputSteam = new
    }

    public abstract Taxi getInstance();



}
