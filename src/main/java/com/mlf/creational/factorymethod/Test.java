package com.mlf.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        JavaVideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
