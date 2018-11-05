package com.kuanquan.factory.one;

/**
 * 抽象工厂设计模式
 * 工厂里面可以创建不通的类
 * https://www.jianshu.com/p/7deb64f902db
 *
 * 创建抽象工厂类，定义具体工厂的公共接口
 *
 */
public abstract class Factory {

    public abstract AbstractProduct ManufactureContainer();
    public abstract AbstractProduct ManufactureMould();
}
