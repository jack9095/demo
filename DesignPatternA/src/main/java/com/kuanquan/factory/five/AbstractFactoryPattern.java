package com.kuanquan.factory.five;

import com.kuanquan.factory.four.FactoryA;
import com.kuanquan.factory.four.FactoryB;

/**
 * 客户端通过实例化具体的工厂类，并调用其创建不同目标产品的方法创建不同具体产品类的实例
 */
public class AbstractFactoryPattern {

    public static void main(String[] args){
        FactoryA mFactoryA = new FactoryA();
        FactoryB mFactoryB = new FactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.ManufactureContainer().show();
        //A厂当地客户需要模具产品A
        mFactoryA.ManufactureMould().show();

        //B厂当地客户需要容器产品B
        mFactoryB.ManufactureContainer().show();
        //B厂当地客户需要模具产品B
        mFactoryB.ManufactureMould().show();
    }

}
