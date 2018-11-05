package com.kuanquan.factory.four;

import com.kuanquan.factory.one.AbstractProduct;
import com.kuanquan.factory.one.Factory;
import com.kuanquan.factory.three.ContainerProductA;
import com.kuanquan.factory.three.MouldProductA;

/**
 * 生产模具+容器产品
 */
public class FactoryA extends Factory{
    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductA();
    }
}
