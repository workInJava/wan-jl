package com.wan.jl.exercise;

import java.util.List;

public class SyncManager {
    /**
     * 待执行的线程集合，注意这里必须是Runnable接口类型
     */
    private List<Runnable> runnableList;

    public SyncManager() {
    }

    public SyncManager(List<Runnable> runnableList) {
        this.runnableList = runnableList;
    }

    public void setRunnable(List<Runnable> runnableList) {
        this.runnableList = runnableList;
    }

    public void run() {
        //遍历代执行的线程集合
        for (Runnable runnable : runnableList) {
//            runThread(runnable);
            runnable.run();
        }
    }

    /**
     * 按顺序同步执行多个线程
     */
    private void runThread(Runnable runnable) {
        synchronized (this) {
            runnable.run();//这里需要注意的是：必须调用run方法，因为如果你调用了start方法，线程只会向JVM请求资源，但是未必就执行其中的run。
                           //这个方法是同步的，所以当前只有一个线程占用了this对象。
        }
    }
}