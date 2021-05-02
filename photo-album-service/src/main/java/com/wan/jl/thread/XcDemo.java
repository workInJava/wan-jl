package com.wan.jl.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
实现线程的三种方法：
1. 继承Thread类
2. 实现Runnable接口
3. 实现Callable接口，有返回值

线程池参数：
核心线程数，最大线程数，空闲存活时间，时间单位，阻塞队列，拒绝执行策略

线程的状态
新建状态 new
就绪状态 start
运行状态 run 获得cpu
阻塞状态「
等待阻塞：wait 放入等待队列；同步阻塞：同步锁 放入锁池；其他阻塞：sleep 」
 */
public class XcDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("====");
//        Thread t = new ThreadDemo();
//        t.start();
//
//        Thread th = new Thread(new RunnableDemo());
//        th.start();

        int taskSize = 5;
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
//        //创建多个有返回值的任务
//        List<Future> list = new ArrayList<Future>();
//        for(int i = 0; i < taskSize; i++){
//            Callable<String> c  = new CallableDemo(i + "");
//            //执行任务并获取Future对象
//            Future f = pool.submit(c);
//            list.add(f);
//        }
//        //关闭线程池
//        pool.shutdown();
//        //获取所有并发任务的运行结果
//        for(Future f : list) {
//            //获取任务的返回值并输出
//            System.out.println("res:" + f.get().toString());
//        }
        pool.execute(new Runnable(){

            @Override
            public void run() {

            }
        });
    }
}

class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("ThreadDemo");
    }
}

class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("RunnableDemo");
    }
}

class CallableDemo implements Callable<String> {

    private String name;
    CallableDemo(String name) {
        this.name = name;
    }
    @Override
    public String call() throws Exception {

        int i = 0;
        for(;i<30;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i+"";
    }
}