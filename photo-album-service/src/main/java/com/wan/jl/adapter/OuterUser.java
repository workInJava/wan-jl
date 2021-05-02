//package com.wan.jl.adapter;
//
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//@Service
//public class OuterUser implements IOuterUser {
//    @Override
//    public Map<String,String> getUserBaseInfo() {
//        HashMap<String,String> baseInfoMap = new HashMap<String,String>();
//        baseInfoMap.put("userName","这个员工叫混世魔王。。");
//        baseInfoMap.put("mobileNumber","这个员工电话是。。");
//        return baseInfoMap;
//    }
//
//    @Override
//    public Map<String,String> getUserOfficeInfo() {
//        HashMap<String,String> homeInfo = new HashMap<String,String>();
//        homeInfo.put("homeTelNumber","员工的家庭电话是。。");
//        homeInfo.put("homeAddress","员工的家庭地址是。。");
//        return homeInfo;
//    }
//
//    @Override
//    public Map<String,String> getUserHomeInfo() {
//        HashMap<String,String> officeInfo = new HashMap<String,String>();
//        officeInfo.put("jobPosition","这个人的职位是BOSS..");
//        officeInfo.put("officeTelNumber","员工的办公电话是。。");
//        return officeInfo;
//    }
//}
