//package com.wan.jl.proxy.dynamic;
//
//import com.wan.jl.proxy.normal.IGamePlayer;
//import org.springframework.stereotype.Service;
//
//@Service("sss")
//public class GamePlayer implements IGamePlayer {
//
//
//    private IGamePlayer proxy;
//    private String name;
//
//    public GamePlayer(String _name){
//        this.name = _name;
//    }
//
//    @Override
//    public void login(String user, String password) {
//        if(isProxy()){
//            System.out.println(user+"登陆了，密码："+password);
//        }else{
//            System.out.println("请指定代理访问");
//        }
//    }
//
//    @Override
//    public void killBoss() {
//        if(isProxy()){
//            System.out.println("代理"+name+"在杀boss");
//        }else{
//            System.out.println("请指定代理傻boss");
//        }
//    }
//
//    @Override
//    public void upgrade() {
//        if(isProxy()){
//            System.out.println("代理"+name+"在升级");
//        }else{
//            System.out.println("请指定代理升级");
//        }
//    }
//
//
//    private boolean isProxy(){
////        if(proxy == null){
////            return false;
////        }
//        return true;
//    }
//}
