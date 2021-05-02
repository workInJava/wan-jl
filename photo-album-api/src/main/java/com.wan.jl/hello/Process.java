package com.wan.jl.hello;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Map;

public class Process {

    @Autowired
    Map<String,RunTask> mapTask;



    public void process(){

        String beanName = "";


            //mapTask.get(beanName).excute();



    }
}
