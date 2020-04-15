package com.mlf.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setShippingService(new ShippingService());


        giftExchangeService.giftExchange(pointsGift);
    }
}
