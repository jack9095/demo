package Java.dynamicproxy.principle;

import Java.dynamicproxy.one.ProductServiceImpl;
import sun.reflect.Reflection;

import java.lang.reflect.*;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Objects;

/**
 * jdk动态代理的内部实现过程
 */
// 继承了Proxy类
public final class $Proxy0 extends Proxy implements ProductServiceImpl {
    private static Method m1;
    private static Method m8;
    private static Method m2;
    private static Method m3;
    private static Method m5;
    private static Method m4;
    private static Method m7;
    private static Method m9;
    private static Method m0;
    private static Method m6;

    public $Proxy0(InvocationHandler var1) throws  {
        super(var1);
    }

    /**
     * 这里是代理类实现的被代理对象的接口的相同方法
     */
    public final void addProduct(String var1) throws  {
        try {
            // super.h 对应的是父类的h变量，他就是Proxy.nexInstance方法中的InvocationHandler参数
            // 所以这里实际上就是使用了我们自己写的InvocationHandler实现类的invoke方法
            super.h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }



    public final Class getClass() throws  {
        try {
            return (Class)super.h.invoke(this, m7, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }


    // 在静态构造块中，代理类通过反射获取了被代理类的详细信息，比如各种方法
    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m8 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("notify");
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m3 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("addProduct", Class.forName("java.lang.String"));
            m5 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("wait", Long.TYPE);
            m4 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("wait", Long.TYPE, Integer.TYPE);
            m7 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("getClass");
            m9 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("notifyAll");
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
            m6 = Class.forName("com.gwf.jdkproxy.ProductServiceImpl").getMethod("wait");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}

//补充一下上面代码注释中的super.h

    protected InvocationHandler h;

    protected Proxy(InvocationHandler h) {
        Objects.requireNonNull(h);
        this.h = h;
    }

    // 这个方法是Proxy的newProxyInstance方法，主要就是生成了上面的动态字节码文件
    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
            throws IllegalArgumentException
    {
        Objects.requireNonNull(h);

        final Class<?>[] intfs = interfaces.clone();
        final SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            checkProxyAccess(Reflection.getCallerClass(), loader, intfs);
        }

        /*
         * Look up or generate the designated proxy class.
         */
        Class<?> cl = getProxyClass0(loader, intfs);

        /*
         * Invoke its constructor with the designated invocation handler.
         */
        try {
            if (sm != null) {
                checkNewProxyPermission(Reflection.getCallerClass(), cl);
            }

            final Constructor<?> cons = cl.getConstructor(constructorParams);

            final InvocationHandler ih = h;
            if (!Modifier.isPublic(cl.getModifiers())) {
                AccessController.doPrivileged(new PrivilegedAction<Void>() {
                    public Void run() {
                        cons.setAccessible(true);
                        return null;
                    }
                });
            }
// 重点看这里，将我们传来的InvocationHandler参数穿给了构造函数
            return cons.newInstance(new Object[]{h});
        } catch (IllegalAccessException|InstantiationException e) {
            throw new InternalError(e.toString(), e);
        } catch (InvocationTargetException e) {
            Throwable t = e.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new InternalError(t.toString(), t);
            }
        } catch (NoSuchMethodException e) {
            throw new InternalError(e.toString(), e);
        }
    }