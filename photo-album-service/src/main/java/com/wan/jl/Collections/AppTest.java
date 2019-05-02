package com.wan.jl.Collections;

import javafx.beans.binding.ObjectExpression;

import java.util.HashMap;
import java.util.Map;

public class AppTest {


    private Object o = new Object();

    public static void main(String agrs[]){
        HashMap<String,String> map = new HashMap();
        for(int i=0;i<13;i++){
            if(i==11){
                System.out.println("");
            }
            if(i==12){
                System.out.println("");
            }
            map.put(""+i,"");
        }


    }


    public synchronized void test1(){

    }


    public  void test2(){
        synchronized(this){

        }
    }


    public  void test3(){
        synchronized(o){

        }
    }

    public void test4(){

        String[] st = {};
        String[] st1 = new String[1];
        AppTest[] s = new AppTest[2];

        Map<String,Object> map = new HashMap<>();
        map.put("w",0);
        System.out.println();

    }
}
