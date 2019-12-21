package com.wan.jl.chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] arges) {
        Random rand = new Random();
        List<IWomen> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(new Women("我要出去逛街",rand.nextInt(4)));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for(IWomen women:arrayList){
            father.handlerMessage(women);
        }
    }

}