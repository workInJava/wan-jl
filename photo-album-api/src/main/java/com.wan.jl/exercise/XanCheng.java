package com.wan.jl.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java创建线程的三种方法
 * 实现Runnable接口
 * 继承Thread类
 * 通过Callable和Future创建线程
 */

class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;
    private int ticket = 10;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
//        try {
//            for(int i = 5; i > 0; i--) {
//                System.out.println("Thread: " + threadName + ", " + i);
//
//                Thread.sleep(50);
//            }
            for(int i = 20; i > 0; i--) {
                //Thread.sleep(500);
                if(ticket > 0) {
                    System.out.println("Thread: " + threadName + ", ticket: " + ticket--);
                }
            }
//        } catch (InterruptedException e) {
//            System.out.println("Thread " +  threadName + " interrupted.");
//        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

//    public void start() {
//        System.out.println("Starting: " + threadName);
//        if(t == null) {
//            t = new Thread(this, threadName);
//            t.start();
//        }
//    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    private int ticket = 5;

    ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running: " + threadName);
        try {
//            for(int i = 5; i > 0; i--) {
//                System.out.println("Thread: " + threadName + ", " + i + ",  " + Thread.currentThread());
//                Thread.sleep(50);
//            }
            for(int i = 10; i > 0; i--) {
                Thread.sleep(50);
                if(ticket > 0) {
                    System.out.println("Thread: " + threadName + ", ticket: " + ticket-- + ",  " + Thread.currentThread());
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting: " + threadName);
        if(t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}

class CallableThreadTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception
    {
        int i = 0;
        for(;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }
}

public class XanCheng {

    public static void main(String args[]) {
        RunnableDemo demo = new RunnableDemo("thread");
        Thread thread1 = new Thread(demo, "窗口一");
        Thread thread2 = new Thread(demo, "窗口二");
        Thread thread3 = new Thread(demo, "窗口三");

//        thread1.start();
//        thread2.start();
//        thread3.start();

        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(thread1);
        runnableList.add(thread2);
        runnableList.add(thread3);

        SyncManager manager = new SyncManager(runnableList);
        manager.run();

//        RunnableDemo demo1 = new RunnableDemo("thread-1");
//        demo1.start();
//
//        RunnableDemo demo2 = new RunnableDemo("thread-2");
//        demo2.start();

//        ThreadDemo demo1 = new ThreadDemo("thread-1");
//        demo1.start();
//
//        ThreadDemo demo2 = new ThreadDemo("thread-2");
//        demo2.start();

//        CallableThreadTest ctt = new CallableThreadTest();
//        FutureTask<Integer> ft = new FutureTask<>(ctt);
//        for(int i = 0;i < 100;i++)
//        {
//            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
//            if(i==20)
//            {
//                new Thread(ft,"有返回值的线程").start();
//            }
//        }
//        try
//        {
//            System.out.println("子线程的返回值："+ft.get());
//        } catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        } catch (ExecutionException e)
//        {
//            e.printStackTrace();
//        }
    }
}
