package com.mlf.tank;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
    static Properties props = new Properties();

    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object get(String key){
        if(props == null ) return null;
        return props.get(key);
    }

    public static void main(String[] args) {
        Object initTankCount = PropertyMgr.get("initTankCount");
        System.out.println(initTankCount);
    }
}
