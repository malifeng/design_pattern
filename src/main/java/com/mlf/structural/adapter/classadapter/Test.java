package com.mlf.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Adapter adapter = new Adapter();
        adapter.request();
    }
}
