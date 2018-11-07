package factory.four;

import factory.two.ContainerProduct;

/**
 * 容器产品B类
 */
public class ContainerProductB extends ContainerProduct {
    @Override
    public void show() {
        System.out.println("生产出了容器类产品B");
    }
}
