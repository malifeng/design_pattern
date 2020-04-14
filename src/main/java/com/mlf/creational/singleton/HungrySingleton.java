package com.mlf.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton ;
    private  HungrySingleton(){
        if(hungrySingleton!=null){
            throw new RuntimeException("不允许反射创建实例");
        }
    }

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
