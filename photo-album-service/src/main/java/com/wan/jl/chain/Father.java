package com.wan.jl.chain;


public class Father extends Handler {

    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("=======女儿向父亲请求=========");
        System.out.println(women.getRequest());
        System.out.println("=======父亲同意女儿请求========");
    }
}
