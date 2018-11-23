package Java.dynamicproxy.test;

import Java.dynamicproxy.one.ProductService;
import Java.dynamicproxy.one.ProductServiceImpl;
import Java.dynamicproxy.two.JDKInvocationHandler;
import sun.misc.ProxyGenerator;
import java.io.FileOutputStream;

/**
 * jdk动态代理实现过程
 1.拿到被代理对象的引用，然后获取他的接口 (Proxy.getInstance方法)
 2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口 （上面的反编译文件中实现了同样的接口）
 3.把被代理对象的引用拿到了（上面被代理对象中在静态代码块中通过反射获取到的信息，以及我们实现的JdkInvocationHandler中的target）
 4.重新动态生成一个class字节码
 5.然后编译
 */
public class Test {

    public static void main(String[] args) throws Exception {
        ProductService productService = new ProductServiceImpl();

        JDKInvocationHandler jdkInvocationHandler = new JDKInvocationHandler();

        ProductService proxy = (ProductService) jdkInvocationHandler.getInstance(productService);
        proxy.addProduct("金融");

        // 这里我们将jdk生成的代理类输出了出来，方便后面分析使用
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{productService.getClass()});

        FileOutputStream os = new FileOutputStream("Proxy0.class");
        os.write(bytes);
        os.close();

    }

}
