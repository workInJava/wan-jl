package com.wan.jl.stream;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicate {


   static class App{
        String a;

        public App(String a){
            this.a =a ;
        }
        public void setA(String a){
            this.a = a;
        }
        public String getA(){
            return a;
        }
    }

    public  static boolean isGreen(App app){
        return StringUtils.endsWithIgnoreCase(app.getA(),"Green");
    }


    static List<App> con(List<App> appList, Predicate<App> predicate){
        List<App> list = appList.stream().filter(predicate).collect(Collectors.toList());
        return list;
    }


    public static void main(String[] agrs){
        List<App> apps = new ArrayList<>();
        apps.add(new App("ss"));
        apps.add(new App("dfdGreen"));
        apps.add(new App("ds"));
        apps.add(new App("dfsfGreen"));
        System.out.println(JSONObject.toJSONString(con(apps,TestPredicate::isGreen)));
    }
}
