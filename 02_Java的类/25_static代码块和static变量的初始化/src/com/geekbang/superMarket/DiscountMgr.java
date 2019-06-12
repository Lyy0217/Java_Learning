package com.geekbang.superMarket;

public class DiscountMgr {
    public static void main(String[] args) {
        System.out.println("最终main 方法中使用的SVIP_DISCOUNT是" + SVIP_DISCOUNT);
    }

    public static double BASE_DISCOUNT;
    public static double VIP_DISCOUNT;

    // >> TODO 使用某个静态变量的代码块必须在静态变量后面
    // >> TODO （但是仅仅赋值没有限制，很妖的语法哈，有些语法就应该在学会的第一时间忘掉它）
    public static double SVIP_DISCOUNT;

    static{
        BASE_DISCOUNT = 0.99;
        VIP_DISCOUNT = 0.85;
        SVIP_DISCOUNT = 0.75;

        // >> TODO 静态代码块里当然可以有任意的合法代码
        System.out.println("静态代码块1里的SVIP_DISCOUNT" + SVIP_DISCOUNT);

        // >> TODO 这段代码在哪个方法中呢？<clinit>，即class init。会在每个class初始化的时候被调用一次
//         SVIP_DISCOUNT = 9/0;
    }

    static{
        SVIP_DISCOUNT = 0.1;
        System.out.println("静态代码块2里的SVIP_DISCOUNT" + SVIP_DISCOUNT);
    }
}
