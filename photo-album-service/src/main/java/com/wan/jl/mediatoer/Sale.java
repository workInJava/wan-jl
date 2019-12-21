package com.wan.jl.mediatoer;

import java.util.Random;

public class Sale extends AbstractColleague{

    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number){
//        Stock stock = new Stock();
//        Purchase purchase = new Purchase();
//        //库存不足
//        if(stock.getStockNumber()<number){
//            purchase.buyIBMComputer(number);
//        }
//        System.out.println("销售IBM电脑"+number+"台");
//        stock.decrease(number);
        super.mediator.excute("sale.sell",number);
        System.out.println("销售IBM电脑"+number+"台");
    }

    //获取库存数量
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int salelStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售情况："+salelStatus);
        return salelStatus;
    }

    //折价处理
    public void offSale(){
        super.mediator.excute("sale.offsell");
    }

}
