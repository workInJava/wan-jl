package com.wan.jl.adapter;

public class Client {


    public static void main(String[] args){
//        IUserInfo youngGirl = new UserInfo();
//        for(int i=0;i<101;i++){
//            youngGirl.getMobileNumber();
//        }
        IUserInfo youngGirl = new OuterUserInfo();
        for(int i=0;i<101;i++){
            youngGirl.getMobileNumber();
        }
    }

}
