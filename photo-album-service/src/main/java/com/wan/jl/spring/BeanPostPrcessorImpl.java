package com.wan.jl.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostPrcessorImpl implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println("对象" + beanName + "开始实例化");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("对象" + beanName + "实例化完成");
        return bean;
    }
}
