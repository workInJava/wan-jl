package com.wan.jl.aop;

import lombok.Data;

@Data
public class DBbean {

    private String driverName ;
    private String url;
    private String userName;
    private String password;
    private int initConnections;
    private int maxActiveConnections;
    private int maxConnections;
    private long connTimeOut;
    private long lazyCheck;
    private long periodCheck;

    public boolean isCheakPool(){
        return false;
    }
}
