package com.geekbang.superMarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }
    // >> TODO 在方法定义中指定方法的返回值类型
    // >> TODO Java中一个方法只能有一种返回值，如果不需要返回值则用void表示
    // >> TODO 如果定义了返回值，则必须使用 return 语句返回方法的返回值，return 是 Java 的关键字
    // >> TODO 可以认为，返回值必须要能够用来给返回值类型的变量赋值
    //计算毛利率
    public double calculatProfit(){
        double profit = soldPrice - purchasePrice;
        if(profit<=0){
            return 0;
        }else {
            return profit;
        }
    }
    public double getCurrentCount(){
        return count;
    }

    public int getIntSoldprice(){
        return (int)soldPrice;
    }
}
