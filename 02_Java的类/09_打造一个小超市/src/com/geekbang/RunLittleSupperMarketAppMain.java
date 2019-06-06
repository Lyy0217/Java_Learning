package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.superMarket.LittleSuperMarket;
import com.geekbang.superMarket.Merchandise;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.supermarketName = "中百超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        /* 方便使用 */
        Merchandise[] all = littleSuperMarket.merchandises;

        //初始化每一件商品
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("超市开门啦！");

        boolean open = true;
        Scanner in = new Scanner(System.in);

        while (open) {
            System.out.println("本店叫做：" + littleSuperMarket.supermarketName);
            System.out.println("本店地址：" + littleSuperMarket.address);
            System.out.println("共有停车位数量：" + littleSuperMarket.parkingCount);
            System.out.println("今天的营业额为：" + littleSuperMarket.inComingSum);
            System.out.println("共有商品：" + littleSuperMarket.merchandises.length + "种");

            //顾客信息
            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDriverCar = Math.random() > 0.5;

            if (customer.isDriverCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来。本店已为您安排了车位，停车免费，车位编号为：" +
                            littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("不好意思，本店车位已满。欢迎您下次再来");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临本店");
            }
            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。请输入想要选购的商品编号。");
                int index = in.nextInt();

                if (index < 0) {
                    break;
                }
                if (index >= all.length) {
                    System.out.println("本店没有这种商品，请输入编号在0--" + (all.length - 1) + "之间的商品编号。");
                    continue;
                }

                Merchandise m = all[index];

                System.out.println("您选购的商品名字是" + m.name + "。单价是：" + m.soldPrice + "。请问要购买多少个？");
                int numToBuy = in.nextInt();

                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎继续选购。");
                    continue;
                }
                if (numToBuy > m.count) {
                    System.out.println("本商品库存没有那么多，请重新选择。");
                    continue;
                }
                if (numToBuy * m.soldPrice > customer.money) {
                    System.out.println("您带的钱不够，欢迎继续选购。");
                    continue;
                }

                totalCost += numToBuy * m.soldPrice;

                m.count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;
            }

            customer.money -= totalCost;

            if (customer.isDriverCar) {
                littleSuperMarket.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "供消费了：" + totalCost);
            littleSuperMarket.inComingSum += totalCost;

            System.out.println("还继续营业么？");
            open = in.nextBoolean();
        }

        System.out.println("超市关门了！");
        System.out.println("今天总的营业额为：" + littleSuperMarket.inComingSum + "。营业情况如下：");

//        littleSuperMarket.merchandiseSold
        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; ++i) {
            Merchandise m = all[i];
            int numToSold = littleSuperMarket.merchandiseSold[i];
            if (numToSold > 0) {
                double inComing = m.soldPrice * numToSold;
                double netinComing = (m.soldPrice - m.purchasePrice) * numToSold;
                System.out.println(m.name+"售出了"+numToSold+"个。销售额为："+
                        inComing+"。净利润为："+netinComing);
            }
        }
    }
}
