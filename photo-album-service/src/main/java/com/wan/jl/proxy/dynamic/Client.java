package com.wan.jl.proxy.dynamic;

import com.wan.jl.proxy.normal.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args)throws Exception {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println("开始打怪");
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        proxy.login("proxy","hah");
        proxy.killBoss();
        proxy.upgrade();
    }
}
