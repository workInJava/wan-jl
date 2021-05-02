package com.wan.jl.aop;

import com.wan.jl.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Aspect 切面
 * 日志切面
 */
@Aspect
@Component
@Slf4j
public class LogAspect {


    /**
     * Pointcut 切入点
     * 匹配cn.controller包下面的所有方法
     */
    @Pointcut("@annotation(com.wan.jl.aop.LogAnnotation)")
    public void webLog(){}

    /**
     * 环绕通知
     */
    @Around(value = "webLog()")
    public Object arround(ProceedingJoinPoint pjp) {
        Object o = null;
        try{
            o =  pjp.proceed();
        }catch (MyException e){
            log.info("hah");

        }catch (Throwable e){

        }
        return o;
    }
}