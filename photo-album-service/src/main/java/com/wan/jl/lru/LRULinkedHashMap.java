package com.wan.jl.lru;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 类说明：利用LinkedHashMap实现简单的缓存， 必须实现removeEldestEntry方法，具体参见JDK文档
 *
 * @author dennis
 *
 * @param <K>
 * @param <V>
 */
public class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxCapacity;

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private final Lock lock = new ReentrantLock();

    public LRULinkedHashMap(int maxCapacity) {
        super(maxCapacity, DEFAULT_LOAD_FACTOR, true);
        this.maxCapacity = maxCapacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> oldest) {
        return size() > maxCapacity;
    }
    @Override
    public boolean containsKey(Object key) {
        try {
            lock.lock();
            return super.containsKey(key);
        } finally {
            lock.unlock();
        }
    }



    @Override
    public V get(Object key) {
        try {
            lock.lock();
            V v = super.get(key);
            //this.put(key,v);
            return v;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            lock.lock();
            return super.put(key, value);
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        try {
            lock.lock();
            return super.size();
        } finally {
            lock.unlock();
        }
    }

    public void clear() {
        try {
            lock.lock();
            super.clear();
        } finally {
            lock.unlock();
        }
    }

    public Collection<Map.Entry<K, V>> getAll() {
        try {
            lock.lock();
            return new ArrayList<Map.Entry<K, V>>(super.entrySet());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){
        LRULinkedHashMap<String,String> n  = new LRULinkedHashMap<>(3);
        n.put("11","qqqqq");
        n.put("12","qqwwqqq");
        n.put("13","w");
        n.get("11");
        System.out.println(JSONObject.toJSONString(n));
        n.put("14","vvv");
        n.put("15","q");


        System.out.println(JSONObject.toJSONString(n));

//        Map<String,String> map = new HashMap<>();
//        map.put("11","qqq");
//        map.put("22","www");
//        map.put("33","wss");
//        System.out.println(JSONObject.toJSONString(n));

    }
}