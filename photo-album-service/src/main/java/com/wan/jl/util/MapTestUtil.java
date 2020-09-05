package com.wan.jl.util;

import java.util.*;
import java.util.function.Function;

public class MapTestUtil {


    public static  void main(String[] args){
        Map<String,Object> map = new HashMap<String,Object>();

        String[] one_keys = {};
        String[] two_keys = {};
        String[] three_keys = {};





    }



    public static Set<String> mapKeyToSet(Map<String,Object> map){
        return map.keySet();
    }


    public boolean validate(Map<String,Object> map,String key){
        return mapKeyToSet(map).contains(key);
    }


    public <T,R> void tets(Map<String,Object> map, Function<T,R> function,List<String[]> key){

    }

}
