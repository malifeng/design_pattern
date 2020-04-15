package com.mlf.structural.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格"+battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格"+battercakeWithEgg.cost());

        BattercakeWithSausage battercakeWithSausage = new BattercakeWithSausage();
        System.out.println(battercakeWithSausage.getDesc()+" 销售价格"+battercakeWithSausage.cost());
    }
}
