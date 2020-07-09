package com.mlf.tank;

import java.util.stream.Stream;

public class FourStrategy implements FireStrategy {
    private static FourStrategy fourStrategy;

    static {
        fourStrategy = new FourStrategy();
    }

    private FourStrategy(){}

    public static FourStrategy getInstance(){
        return fourStrategy;
    }

    @Override
    public void fire(Tank tank) {
        Stream.of(Dir.values()).forEach(dir-> {
            new Bullet(10, tank.x + 20, tank.y + 20, dir, tank.tf, tank.group);
        });

    }
}
