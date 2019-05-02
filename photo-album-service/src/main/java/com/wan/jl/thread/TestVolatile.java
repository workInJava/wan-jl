package com.wan.jl.thread;


import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestVolatile {

    private AtomicInteger atomicInteger = new AtomicInteger();

    public  void test() {
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(10l);
            }catch (Exception e){

            }
            System.out.println(Thread.currentThread().getName()+"======="+i);
            atomicInteger.addAndGet(1);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile te = new TestVolatile();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,20l,
                TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(23));
        for(int i=0;i<25;i++){
            executor.execute(()->{
                te.test();
            });
        }


        System.out.println("main continue");
        executor.shutdown();



        while(executor.getActiveCount()>0){
            System.out.println(executor.getActiveCount());
        }


        System.out.println("main end"+ te.atomicInteger.get());

    }
}
