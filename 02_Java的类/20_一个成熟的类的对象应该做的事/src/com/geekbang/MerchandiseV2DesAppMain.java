package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2;


public class MerchandiseV2DesAppMain {
    public static void main(String[] args) {
        MerchandiseV2 merchandise =new MerchandiseV2();

        merchandise.init("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
    }
}
