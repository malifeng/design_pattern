package com.mlf.tank;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
    static Properties props = null;

    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
