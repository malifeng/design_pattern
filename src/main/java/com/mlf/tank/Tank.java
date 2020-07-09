package com.mlf.tank;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Tank {
    int x, y;
    Dir dir = Dir.DOWN;
    private static final int SPEED = 10;
    private boolean moving = true;
    private boolean living = true;
    private Image img = ResourceMgr.tankU;
    private int WIDTH;
    private Random random = new Random();
    Group group;
    public Rectangle rectangle = new Rectangle();

    public int getWIDTH() {

        return ((BufferedImage) img).getWidth();
    }

    public int getHEIGHT() {
        return ((BufferedImage) img).getHeight();
    }

    private int HEIGHT;

    TackFrame tf = null;


    public Tank(int x, int y, Dir dir, TackFrame tf, Group group) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
        this.group = group;
        this.rectangle.x = x;
        this.rectangle.y = y;
        this.rectangle.width = getWIDTH();
        this.rectangle.height = getHEIGHT();
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
        if (!living) return;

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

        this.boundsCheck();

        this.rectangle.x = x;
        this.rectangle.y = y;

        if (!this.group.equals(Group.WHITE) && random.nextInt(10) > 8) this.fire(DefaultFireStrategy.getInstance());
        if (!this.group.equals(Group.WHITE) && random.nextInt(100) > 90) this.randomDir();
    }


    public Group getGroup() {
        return group;
    }

    public void boundsCheck() {
        if (
                x >= TackFrame.TF_WIDTH - getWIDTH() ||
                        y >= TackFrame.TF_HEIGHT - getHEIGHT() ||
                        x < 0 ||
                        y < 0
        ) {
            this.randomDir();
        }
    }

    public void fire(FireStrategy fireStrategy) {
        fireStrategy.fire(this);
    }

    public void die() {
        this.living = false;
        if (this.group == Group.WHITE) {
            tf.myTank = null;
        } else {
            tf.tanks.remove(this);
        }
    }

    public void randomDir() {
        if (group.equals(Group.WHITE)) {
            return;
        }
        this.dir = Dir.values()[random.nextInt(4)];
    }
}
