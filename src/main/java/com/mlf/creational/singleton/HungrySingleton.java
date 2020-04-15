package com.mlf.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable ,Cloneable {

    private final static HungrySingleton hungrySingleton ;
    private  HungrySingleton(){
        if(hungrySingleton!=null){
            throw new RuntimeException("不允许反射创建实例");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return HungrySingleton.getInstance();
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
