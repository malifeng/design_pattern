package com.mlf.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class TackFrame extends Frame {

    static final int TF_WIDTH = 600;
    static final int TF_HEIGHT = 800;
    Tank myTank = new Tank(100, 500, Dir.DOWN, this,Group.WHITE);
    List<Bullet> bullets = new ArrayList<>();
    List<Tank> tanks = new ArrayList<>();
    Explode e = new Explode(100, 100, this);
    List<Explode> explodes = new ArrayList<>();

    public TackFrame() throws HeadlessException {
        setSize(TackFrame.TF_WIDTH, TackFrame.TF_HEIGHT);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);
        setBackground(Color.black);


        this.addKeyListener(new MyKeyListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public List<Explode> getExplodes() {
        return explodes;
    }

    @Override
    public void paint(Graphics g) {
        if(myTank!=null){
            myTank.paint(g);
        }
        g.setColor(Color.white);
        g.drawString("子弹的数量：" + bullets.size(), 10, 60);
        g.drawString("敌人的数量：" + tanks.size(), 10, 70);
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).paint(g);
        }

        for (int i = 0; i < tanks.size(); i++) {
            tanks.get(i).paint(g);
        }

        for (int i = 0; i < explodes.size(); i++) {
            explodes.get(i).paint(g);
        }

        for (int i = 0; i < bullets.size(); i++) {
            if (bullets.size() == 0) {
                break;
            }
//            if(myTank!=null){
//                bullets.get(i).collideWith(myTank);
//            }

            for (int j = 0; j < tanks.size(); j++) {
                if (bullets.size() == 0 || j >= tanks.size()) {
                    break;
                }

                bullets.get(i).collideWith(tanks.get(j));
            }
        }

    }


    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;

                default:
                    break;
            }
            setMainTankDir();
            repaint();
        }


        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                case KeyEvent.VK_CONTROL:
                    myTank.fire(DefaultFireStrategy.getInstance());
                    break;

                default:
                    break;
            }
            setMainTankDir();
        }

        private void setMainTankDir() {
            if (!bL && !bU && !bR && !bD) {
                myTank.setMoving(false);
            } else {
                myTank.setMoving(true);
                if (bL) myTank.setDir(Dir.LEFT);
                if (bR) myTank.setDir(Dir.RIGHT);
                if (bU) myTank.setDir(Dir.UP);
                if (bD) myTank.setDir(Dir.DOWN);
            }

        }
    }
}
