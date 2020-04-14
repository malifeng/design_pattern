package com.mlf.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) {
//        LazySingleton singleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//
//        t1.start();
//        t2.start();
//        System.out.println("program end");

        //----------------------------------------------
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        try {
//            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//            outputStream.writeObject(singleton);
//
//            File file = new File("singleton_file");
//            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
//
//            HungrySingleton newInstance = (HungrySingleton) inputStream.readObject();
//
//            System.out.println(singleton);
//            System.out.println(newInstance);
//            System.out.println(singleton==newInstance);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        // ------------------------------------

//        Class objectClass = HungrySingleton.class;
//        try {
//            Constructor constructor = objectClass.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            HungrySingleton instance = HungrySingleton.getInstance();
//            HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//            System.out.println(instance);
//            System.out.println(newInstance);
//            System.out.println(newInstance == instance);
//
//
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        // -------------------------------------

//        EnumInstance instance = EnumInstance.getInstance();
//
//        instance.printTest();



    }
}
