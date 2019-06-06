package com.geekbang.superMarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    // >> 返回值类型可以是类名，这时候实际返回的值就是这个类的引用
    public Merchandise getBiggistProfitMerchandise(){
        Merchandise curr =null;
        for(int i=0;i<merchandises.length;i++){
            Merchandise m=merchandises[i];
            if(curr==null){
                curr=m;
                continue;
            }else{
                if(curr.calculatProfit()<m.calculatProfit()){
                    curr=m;
                }
            }
        }
        return curr;
    }
}
