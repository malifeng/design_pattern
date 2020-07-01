package com.mlf.tank;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Tank {
    private int x, y;
    private Dir dir = Dir.DOWN;
    private static final int SPEED = 10;
    private boolean moving = false;
    private boolean living = true;
    private Image img = ResourceMgr.tankU;
    private int WIDTH;

    public int getWIDTH() {

        return ((BufferedImage)img).getWidth();
    }

    public int getHEIGHT() {
        return ((BufferedImage)img).getHeight();
    }

    private int HEIGHT;

    private TackFrame tf = null;


    public Tank(int x, int y, Dir dir, TackFrame tf) {
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
//        g.fillRect(x, y, 50, 50);
        if(!living) return;

        g.drawImage(img, x, y, null);
        move();

    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    private void move() {
        if (!moving) {
            return;
        }
        switch (dir) {
            case LEFT:
                x -= SPEED;
                img = ResourceMgr.tankL;
                break;
            case RIGHT:
                x += SPEED;
                img = ResourceMgr.tankR;
                break;
            case UP:
                y -= SPEED;
                img = ResourceMgr.tankU;
                break;
            case DOWN:
                y += SPEED;
                img = ResourceMgr.tankD;
                break;
            default:
                break;
        }
    }


    public void fire() {
        tf.bullets.add(new Bullet(10, this.x + 20, this.y + 20, this.dir, this.tf));
    }

    public void die() {
        this.living =false;
        tf.tanks.remove(this);
    }
}
