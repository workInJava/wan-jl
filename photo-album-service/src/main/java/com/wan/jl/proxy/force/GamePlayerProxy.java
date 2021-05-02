//package com.wan.jl.proxy.force;
//
//import com.wan.jl.proxy.IProxy;
//import org.springframework.stereotype.Service;
//
//@Service
//public class GamePlayerProxy implements IGamePlayer , IProxy {
//
//    private GamePlayer gamePlayer;
//
//    @Override
//    public void count() {
//        System.out.println("打怪升级10元");
//    }
//
//    public GamePlayerProxy(GamePlayer gamePlayer) {
//        this.gamePlayer = gamePlayer;
//    }
//
//    @Override
//    public void login(String user, String password) {
//        gamePlayer.login(user,password);
//    }
//
//    @Override
//    public void killBoss() {
//        gamePlayer.killBoss();
//    }
//
//    @Override
//    public void upgrade() {
//        count();
//        gamePlayer.upgrade();
//    }
//
//    @Override
//    public IGamePlayer getProxy() {
//        return this;
//    }
//}
