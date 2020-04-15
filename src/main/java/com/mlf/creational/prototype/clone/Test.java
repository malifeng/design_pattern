package com.mlf.creational.prototype.clone;

import com.mlf.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇", birthday);
//        Pig pig2 = (Pig)pig1.clone();
//
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig1.getBirthday().setTime(66666666666L);
//
//        System.out.println(pig1);
//        System.out.println(pig2);

        HungrySingleton singleton = HungrySingleton.getInstance();

        Method method = singleton.getClass(

        ).getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneSingleton = (HungrySingleton) method.invoke(singleton);
        System.out.println(cloneSingleton);
        System.out.println(singleton);

    }
}
