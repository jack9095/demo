package com.kuanquan.factory.three;

import com.kuanquan.factory.two.ContainerProduct;

/**
 * 容器产品A类
 */
public class ContainerProductA extends ContainerProduct {

    @Override
    public void show() {
        System.out.println("生产出了容器产品A类");
    }
}
