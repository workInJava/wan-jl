package com.wan.jl.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("com.wan.jl.exercise.Poker");
        Poker P = (Poker) c.newInstance();
        //Constructor constructor = c.getConstructor();
        //Poker p2 = (Poker) constructor.newInstance();
    }
}
