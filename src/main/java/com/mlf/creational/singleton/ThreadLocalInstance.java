package com.mlf.creational.singleton;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected com.mlf.creational.singleton.ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){};

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}
