package com.wan.jl;

public class TestMain {

    public static void main(String[] args) throws Exception{

        Thread t = new Thread(()->{
           try {
               Thread.sleep(2000l);

           }catch (Exception e){

           }
            System.out.println(Thread.currentThread().getName()+" end!");
        });

        t.start();

        t.join();

        System.out.println("============");


    }
}
