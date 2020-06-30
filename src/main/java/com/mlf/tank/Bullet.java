package com.mlf.tank;

import java.awt.*;

public class Bullet {
    private int SPEED = 10;
    private int x,y;
    private Dir dir;
    private static int WIDTH = 10,HEIGHT=10;
    private TackFrame tf;

    public Bullet(int SPEED, int x, int y, Dir dir,TackFrame tf) {
        this.SPEED = SPEED;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x,y,WIDTH,HEIGHT);
        move();
    }

    private void move() {
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }
        if(this.x<0 || this.y<0 || this.x>TackFrame.TF_WIDTH || this.y>TackFrame.TF_HEIGHT){
            tf.bullets.remove(this);
        }
    }
}
