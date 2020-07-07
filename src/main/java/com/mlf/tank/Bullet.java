package com.mlf.tank;

import java.awt.*;

public class Bullet {
    private int SPEED = 10;
    private int x, y;
    private Dir dir;
    private static int WIDTH = 10, HEIGHT = 10;
    private TackFrame tf;
    private Image img;
    private Boolean living = true;
    private Group group;
    private Rectangle rectangle = new Rectangle();

    public Group getGroup() {
        return group;
    }

    public Bullet(int SPEED, int x, int y, Dir dir, TackFrame tf, Group group) {
        this.SPEED = SPEED;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
        this.group = group;
        this.rectangle.x = x;
        this.rectangle.y = y;
        this.rectangle.width = WIDTH;
        this.rectangle.height = HEIGHT;
        switch (dir) {
            case LEFT:
                this.img = ResourceMgr.bulletL;
                break;
            case RIGHT:
                this.img = ResourceMgr.bulletR;
                break;
            case UP:
                this.img = ResourceMgr.bulletU;
                break;
            case DOWN:
                this.img = ResourceMgr.bulletD;
                break;
            default:
                break;
        }
    }

    public void paint(Graphics g) {
//        g.setColor(Color.RED);
//        g.fillOval(x,y,WIDTH,HEIGHT);
        if (!living) {
            return;
        }
        g.drawImage(img, x, y, null);
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

        this.rectangle.x = x;
        this.rectangle.y = y;

        if (this.x < 0 || this.y < 0 || this.x > TackFrame.TF_WIDTH || this.y > TackFrame.TF_HEIGHT) {
            tf.bullets.remove(this);
        }
    }

    public void collideWith(Tank tank) {
        if (this.getGroup().equals(tank.getGroup())) {
            return;
        }
        if (this.rectangle.intersects(tank.rectangle)) {
            tank.die();
            this.die();
            tf.explodes.add(new Explode(tank.getX(), tank.getY(), tf));
        }
    }

    private void die() {
        this.living = false;
        tf.bullets.remove(this);
    }
}
