package com.mlf.tank;


import java.util.Random;

public class T {
    public static void main(String[] args) throws InterruptedException {
        TackFrame tackFrame = new TackFrame();

        for (int i = 0; i < 5; i++) {
            tackFrame.tanks.add(new Tank(50 + i* 30,200,Dir.DOWN,tackFrame));
        }

        while (true){
            Thread.sleep(50);
            tackFrame.repaint();
        }
    }
}
