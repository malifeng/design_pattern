package com.mlf.tank;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FireStrategyMgr {
    public static FireStrategy getFireStrategy(String string){
        try {
            Method method = Class.forName((String) PropertyMgr.get(string)).getMethod("getInstance",new Class[]{});
            FireStrategy fireStrategy = (FireStrategy)method.invoke(null, new Class[]{});
            return fireStrategy;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return DefaultFireStrategy.getInstance();
    }
}
