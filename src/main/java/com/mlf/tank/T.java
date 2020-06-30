package com.mlf.tank;


public class T {
    public static void main(String[] args) throws InterruptedException {
        TackFrame tackFrame = new TackFrame();
        while (true){
            Thread.sleep(50);
            tackFrame.repaint();
        }
    }
}
