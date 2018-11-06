package com.kuanquan.strategy.four;

import com.kuanquan.strategy.three.Context_SalesMan;

public class StrategyPattern {
    public static void main(String[] args){

        Context_SalesMan mSalesMan ;

        //春节来了，使用春节促销活动
        System.out.println("对于春节：");
        mSalesMan = new Context_SalesMan("A");
        mSalesMan.SalesManShow();


        //中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        mSalesMan = new Context_SalesMan("B");
        mSalesMan.SalesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        mSalesMan = new Context_SalesMan("C");
        mSalesMan.SalesManShow();
    }
}
