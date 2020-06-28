package com.mlf.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
    public static void main(String[] args) throws InterruptedException {
        TackFrame tackFrame = new TackFrame();
        while (true){
            Thread.sleep(50);
            tackFrame.repaint();
        }
    }
}
