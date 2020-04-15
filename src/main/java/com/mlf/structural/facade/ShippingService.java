package com.mlf.structural.facade;

public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流订单号");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
