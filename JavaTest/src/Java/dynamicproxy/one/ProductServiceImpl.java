package Java.dynamicproxy.one;

/**
 * 实现被代理的接口
 */
public class ProductServiceImpl implements ProductService{
    @Override
    public void addProduct(String productName) {
        System.out.println("正在添加 " + productName);
    }
}
