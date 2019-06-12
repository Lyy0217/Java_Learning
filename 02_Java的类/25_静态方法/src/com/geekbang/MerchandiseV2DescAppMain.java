package com.geekbang;

import com.geekbang.superMarket.MerchandiseV2WithStaticVariable;

import static com.geekbang.superMarket.MerchandiseV2WithStaticVariable.DISCOUNT_FOR_VIP;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        MerchandiseV2WithStaticVariable merchandise = new MerchandiseV2WithStaticVariable
                ("书桌", "DESK9527", 40, 999.9, 500);
        merchandise.describe();

        //todo 使用import static 来引入一个静态变量，就可以直接使用静态变量名来访问了
        System.out.println(DISCOUNT_FOR_VIP);
    }
}
