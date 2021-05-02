package com.wan.jl.exercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//User对象比较器
public class ComparatorUser implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        User u1 = (User) o1;
        User u2 = (User) o2;

        int result = u1.getAge()-u2.getAge();
        return result;

    }


    public static void main(String[] args){
        Map map = new HashMap();

    }

}
