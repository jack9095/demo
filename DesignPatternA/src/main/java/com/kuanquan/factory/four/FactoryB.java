package com.kuanquan.factory.four;

import com.kuanquan.factory.one.AbstractProduct;
import com.kuanquan.factory.one.Factory;
import com.kuanquan.factory.three.ContainerProductB;
import com.kuanquan.factory.three.MouldProductB;

/**
 * 生产模具+容器产品
 */
public class FactoryB extends Factory{
    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductB();
    }
}
