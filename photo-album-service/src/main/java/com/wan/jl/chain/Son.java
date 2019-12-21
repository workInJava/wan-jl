package com.wan.jl.chain;

public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("=======母亲向儿子请求=========");
        System.out.println(women.getRequest());
        System.out.println("=======儿子答应母亲的请求========");
    }
}
