package com.kuanquan.factory.two;

import com.kuanquan.factory.one.AbstractProduct;

/**
 * 创建抽象产品类，定义具体的产品的公共接口
 *
 * 容器产品抽象类
 *
 */
public abstract class ContainerProduct extends AbstractProduct {

    @Override
    public abstract void show();
}
