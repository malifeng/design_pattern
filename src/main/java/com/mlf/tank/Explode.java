package com.mlf.tank;

import java.awt.*;

public class Explode {
    private int WIDTH = ResourceMgr.explodes[0].getWidth();
    private int HEIGHT = ResourceMgr.explodes[0].getHeight();
    private int x,y;
    private boolean living = true;
    private int step = 0;
    private TackFrame tf;

    public Explode(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Explode(int x, int y, TackFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;

    }

    public void paint(Graphics g){
        g.drawImage(ResourceMgr.explodes[step],x,y,null);
        step++;
        if(step >= ResourceMgr.explodes.length)
            tf.getExplodes().remove(this);
    }

}
