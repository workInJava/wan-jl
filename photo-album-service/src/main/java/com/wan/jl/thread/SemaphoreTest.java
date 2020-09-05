package com.wan.jl.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    private Semaphore semaphore = new Semaphore(2);

    public void testMethod(){
        try{
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"end timer="+System.currentTimeMillis());
            semaphore.release();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        SemaphoreTest semaphoreTest = new SemaphoreTest();

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    semaphoreTest.testMethod();
                }
            });
            thread.start();
        }
    }
}
