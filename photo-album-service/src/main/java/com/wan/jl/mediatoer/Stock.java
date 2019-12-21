package com.wan.jl.mediatoer;


public class Stock extends AbstractColleague {

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存量为："+COMPUTER_NUMBER);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存量为："+COMPUTER_NUMBER);
    }

    //
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
       super.mediator.excute("stock.clear");
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

}
