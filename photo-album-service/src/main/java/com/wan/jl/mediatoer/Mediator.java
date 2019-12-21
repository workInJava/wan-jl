package com.wan.jl.mediatoer;

public class Mediator extends AbstractMediator {
    @Override
    public void excute(String str, Object... objects) {
        if(str.equals("purchase.buy")){
            this.buyCpmputer((Integer) objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellComputer((Integer) objects[0]);
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }else if(str.equals("sale.offSell")){
            this.offSale();
        }
    }

    private void buyCpmputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus>80){
            System.out.println("采购IBM电脑："+number+"台");
            super.stock.increase(number);
        }else {
            int buyNumber = number/2;
            System.out.println("采购IBM电脑"+buyNumber+"台");
        }
    }

    private void sellComputer(int number){
        //库存不足
        if(super.stock.getStockNumber()<number){
            purchase.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑"+number+"台");
        super.stock.decrease(number);
    }

    private void offSale(){
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
