package com.geekbang.superMarket;

public class MerchandiseDescAppMain {
    public static void main(String[] args) {
        Merchandise merchandise =new Merchandise();
        merchandise.name="电脑";
//        merchandise.name="电脑";
        merchandise.id="DESC12345";
        merchandise.purchasePrice=3500;
        merchandise.soldPrice=5000;
        merchandise.count=50;
        merchandise.madeIn="China";

        merchandise.describe();
    }
}
