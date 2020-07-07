package com.mlf.tank;


import java.util.Random;

public class T {
    public static void main(String[] args) throws InterruptedException {
        TackFrame tackFrame = new TackFrame();
        int initTankCount = Integer.parseInt((String) PropertyMgr.get("initTankCount"));

        for (int i = 0; i < initTankCount; i++) {
            tackFrame.tanks.add(new Tank(50 + i* 30,200,Dir.DOWN,tackFrame,Group.BLACK));
        }

        while (true){
            Thread.sleep(50);
            tackFrame.repaint();
        }
    }
}
