package com.wan.jl.chain;

public abstract class Handler {

    protected static final int FATHER_LEVEL_REQUEST = 1;
    protected static final int HUSBAND_LEVEL_REQUEST = 2;
    protected static final int SON_LEVEL_REQUEST = 3;
    private Handler nextHandler;
    private int level;

    public  Handler(int _level){
        this.level = _level;
    }


    public void handlerMessage(IWomen women){

        if(women.getType()==this.level){
            this.response(women);
        }else {
            if(this.nextHandler!=null) {
                this.nextHandler.handlerMessage(women);
            }else{
                System.out.println("----没地方处理，按不同意处理------");
            }
        }
    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);
}
