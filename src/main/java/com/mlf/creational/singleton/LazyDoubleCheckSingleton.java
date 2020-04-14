package com.mlf.creational.singleton;

public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1.分配内存给这个对象
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 2.初始化对象
                    // intra-thread semantics----------3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 4.初次访问初始化对象
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
