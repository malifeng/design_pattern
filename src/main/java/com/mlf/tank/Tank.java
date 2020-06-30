package com.mlf.tank;

import com.mlf.creational.prototype.abstractprototype.B;

import java.awt.*;

public class Tank {
    private int x, y ;
    private Dir dir = Dir.DOWN;
    private static final int SPEED = 10;
    private boolean moving  = false;

    private TackFrame tf = null;


    public Tank(int x, int y, Dir dir,TackFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Dir getDir() {
        return dir;
    }

    public static int getSPEED() {
        return SPEED;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        move();

    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    private void move() {
        if(!moving){
           return;
        }
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
    }


    public void fire() {
        tf.bullets.add(new Bullet(10, this.x, this.y, this.dir,this.tf)) ;
    }
}
