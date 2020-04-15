package com.mlf.structural.facade;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验礼物名字"+pointsGift.getName()+"积分资格通过，库存通过");
        return true;
    }
}
