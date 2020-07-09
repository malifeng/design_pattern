package com.mlf.tank;

public class DefaultFireStrategy  implements FireStrategy {

    private static DefaultFireStrategy defaultFireStrategy;

    static {
        defaultFireStrategy = new DefaultFireStrategy();
    }

    private DefaultFireStrategy(){}

    public static DefaultFireStrategy getInstance(){
        return defaultFireStrategy;
    }

    @Override
    public void fire(Tank tank) {
        new Bullet(10, tank.x + 20, tank.y + 20, tank.dir, tank.tf, tank.group);
    }
}
