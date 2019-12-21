package com.wan.jl.chain;

public class Husband extends Handler {

    public  Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("=======妻子请求丈夫======");
        System.out.println(women.getRequest());
        System.out.println("=======丈夫答应妻子的请求========");
    }
}
