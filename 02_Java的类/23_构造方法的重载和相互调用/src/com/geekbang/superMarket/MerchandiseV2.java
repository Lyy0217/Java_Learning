package com.geekbang.superMarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    // >> TODO 构造方法执行前，会执行给局部变量赋初始值的操作
    // >> TODO 我们说过，所有的代码都必须在方法里，那么这种给成员变赋初始值的代码在哪个方法里？怎么看不到呢？
    //    TODO 原来构造方法在内部变成了<init>方法。学习就是要脑洞大，敢想敢试，刨根问底。
    public int count = 999;// 999/0;
    public double soldPrice;
    public double purchasePrice;

    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice){
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public MerchandiseV2(String name,String id, int count, double soldPrice){
        this(name,id,count,soldPrice,soldPrice*0.8);
    }

    public MerchandiseV2(){
        this("无名","000",0,1,1.1);
    }
    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
//        if(profit <= 0){
//            return 0;
//        }
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }
        return this.count -= count;
    }
}
