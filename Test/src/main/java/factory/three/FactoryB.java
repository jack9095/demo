package factory.three;

import factory.four.ContainerProductB;
import factory.one.Factory;
import factory.four.MouldProductB;
import factory.one.AbstractProduct;

/**
 * 生产模具+容器产品
 */
public class FactoryB extends Factory {
    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductB();
    }
}
