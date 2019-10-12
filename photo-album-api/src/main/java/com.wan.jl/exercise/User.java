package com.wan.jl.exercise;


public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.getName()+":"+this.getAge();
    }



    @Override
    public int compareTo(User o) {
        if(this.getAge()-o.getAge()==0){
            return this.getName().compareTo(o.getName());
        }else{
            return this.getAge()-o.getAge();
        }
    }
}
