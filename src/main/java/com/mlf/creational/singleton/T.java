package com.mlf.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton singleton = LazySingleton.getInstance();
//        LazySingleton singleton = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
        ThreadLocalInstance singleton = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+singleton);
    }
}
