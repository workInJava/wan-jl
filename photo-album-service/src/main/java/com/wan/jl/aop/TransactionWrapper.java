package com.wan.jl.aop;

import org.omg.CORBA.SystemException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

public class TransactionWrapper {

    public static Object decorate(Object delegate) {
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(), new XAWrapperHandler(
                        delegate));
    }

    static final class XAWrapperHandler implements InvocationHandler {
        private final Object delegate;

        XAWrapperHandler(Object delegate) {
            this.delegate = delegate;
        }

        //简单起见，包装业务代表对象所有的业务方法
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = null;
            Connection con = ConnectionManager.getConnection();
            try {
                //开始一个事务
                con.setAutoCommit(false);
                //调用原始业务对象的业务方法
                result = method.invoke(delegate, args);
                con.commit();    //提交事务
                con.setAutoCommit(true);
            } catch (Exception t) {
                //回滚
                con.rollback();
                con.setAutoCommit(true);
                throw t;
            }

            return result;
        }
    }
}
