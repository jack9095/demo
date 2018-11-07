package factory.three;

import factory.four.ContainerProductA;
import factory.one.Factory;
import factory.four.MouldProductA;
import factory.one.AbstractProduct;

/**
 * 生产模具+容器产品
 */
public class FactoryA extends Factory {
    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductA();
    }
}
