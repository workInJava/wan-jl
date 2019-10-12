package com.wan.jl.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//对list内对象根据属性值排序
//思路：通过实现Comparator接口做一个对象比较器，然后传入对象容器和比较器 通过Collections.sort 进行排序
public class SortTest {

    public static void main(String args[]) {
        List<User> userlist=new ArrayList();
        userlist.add(new User("dd",4));
        userlist.add(new User("aa",1));
        userlist.add(new User("ee",5));
        userlist.add(new User("bb",2));
        userlist.add(new User("ff",5));
        userlist.add(new User("cc",3));
        userlist.add(new User("gg",6));

//        ComparatorUser comparatorUser = new ComparatorUser();
//        Collections.sort(userlist, comparatorUser);
//
//        for(int i=0;i<userlist.size();i++){
//            User u = (User) userlist.get(i);
//            System.out.println("name:" + u.getName() + ", age:" + u.getAge());
//        }

//        Collections.sort(userlist,(o1,o2)->{
//            if(o1.getAge()-o2.getAge()==0){
//                return o1.getName().compareTo(o2.getName());
//            }else{
//                return o1.getAge()-o2.getAge();
//            }
//        });


//        Collections.sort(userlist, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if(o1.getAge()-o2.getAge()==0){
//                    return o1.getName().compareTo(o2.getName());
//                }else{
//                    return o1.getAge()-o2.getAge();
//                }
//            }
//        });

//        Collections.sort(userlist);
//        userlist.forEach(System.out::println);
//        userlist.forEach(o-> System.out.println(o));

        userlist.stream().sorted((o1,o2)->{
            if(o1.getAge()-o2.getAge()==0){
                return o1.getName().compareTo(o2.getName());
            }else{
                return o1.getAge()-o2.getAge();
            }
        }).collect(Collectors.toList()).forEach(System.out::println);




    }
}
