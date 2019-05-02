package com.wan.jl.aop;

import javax.naming.InitialContext;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TxHandler implements InvocationHandler {

    private Object originalObject;

    public Object bind(Object o){
        this.originalObject = o;
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (!method.getName().startsWith("save")) {
            Object tx = null;
            try{
                tx = new InitialContext().lookup("java/tx");


            }catch (Exception e){

            }
        }
        return method.invoke(originalObject,args);
    }
}
