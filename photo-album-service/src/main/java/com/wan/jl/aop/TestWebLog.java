package com.wan.jl.aop;

import com.wan.jl.exception.MyException;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class TestWebLog {


    public void test01()throws Exception{
        //test();
        ((TestWebLog)AopContext.currentProxy()).test();
    }

    @LogAnnotation()
    public void test()throws Exception{

        try{
            int e = 1/0;
        }catch (Exception e){
            throw new MyException();
        }
    }

}
