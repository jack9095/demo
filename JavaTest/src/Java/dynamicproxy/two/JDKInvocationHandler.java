package Java.dynamicproxy.two;

import Java.dynamicproxy.one.ProductService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 然后先实现一个动态代理
 * 代码很简单了，就是实现java.lang.reflect.InvocationHandler接口，
 * 并使用java.lang.reflect.Proxy.newProxyInstance()方法生成代理对象
 */
public class JDKInvocationHandler implements InvocationHandler {

    ProductService target;

    public Object getInstance(ProductService target) {
        this.target = target;
        Class<? extends ProductService> clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println("日期【" + format +"】添加了一款产品");

        return method.invoke(this.target,args);
    }

}
