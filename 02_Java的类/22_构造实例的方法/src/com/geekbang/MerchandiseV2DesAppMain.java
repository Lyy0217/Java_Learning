package com.geekbang;

import com.geekbang.supermarket.MerchandiseWithConstructor;


public class MerchandiseV2DesAppMain {
    public static void main(String[] args) {
        MerchandiseWithConstructor merchandise =new MerchandiseWithConstructor("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
    }
}
