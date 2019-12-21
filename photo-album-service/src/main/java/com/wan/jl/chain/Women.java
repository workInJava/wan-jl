package com.wan.jl.chain;

public class Women implements IWomen {

    private int type;
    private String massage;

    public Women(String message,int type){
        this.type = type;
        this.massage = message;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return massage;
    }
}
