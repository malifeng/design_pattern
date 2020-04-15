package com.mlf.creational.prototype.abstractprototype;

public class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
