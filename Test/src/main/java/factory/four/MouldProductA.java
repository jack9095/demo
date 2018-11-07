package factory.four;

import factory.two.MouldProduct;

/**
 * 模具产品A类
 */
public class MouldProductA extends MouldProduct {
    @Override
    public void show() {
        System.out.println("生产出了模具类产品A");
    }
}
