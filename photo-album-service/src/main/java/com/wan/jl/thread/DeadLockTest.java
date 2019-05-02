package com.wan.jl.thread;

public class DeadLockTest {


    int lock1,lock2;


    public DeadLockTest(int lock1,int lock2){
        this.lock1=lock1;
        this.lock2 = lock2;
    }

    public void testLock(){
        synchronized (Integer.valueOf(lock1)){
            synchronized (Integer.valueOf(lock2)){
                System.out.println(lock1+lock2);
            }
        }
    }


    public static void main(String[] args){
        DeadLockTest test1 = new DeadLockTest(1,2);
        DeadLockTest test2 = new DeadLockTest(2,1);

        for(int i=0;i<100;i++){
            new Thread(()->test1.testLock()).start();
            new Thread(()->test2.testLock()).start();
        }

    }

}
