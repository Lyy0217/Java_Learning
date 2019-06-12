package com.geekbang.supermarket;

public class MerchandiseV2 {
    public String name;
    public int count;
    public double purchasePrice;
    public double soldPrice;
    public String id;

    /**
     * 初始化商品
     *
     * @param name
     * @param id
     * @param count
     * @param soldPrice
     * @param purchasePrice
     */
    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    // >>TODO
    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return 0;
        }
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }

        return this.count -= count;
    }
}
