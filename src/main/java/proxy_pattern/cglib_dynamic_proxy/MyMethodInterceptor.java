package proxy_pattern.cglib_dynamic_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib
 * 解决了jdk动态代理，委托类必须实现接口的问题。
 * 原理：cglib是一个强大的高性能的代码生成包，底层是通过是用一个小而快的字节码处理框架ASM，
 * 它可以在运行期扩展java类与实现java接口
 * 通过修改字节码文件来生成子类，覆盖其中的方法，并对方法进行增强
 * <p>
 * Enhancer是cglib的字节码增强器，可以很方便的对类进行扩展。
 * 注意：因为采用的是继承，cglib不会代理委托类的fanal方法
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始售卖~~~~~！");
        methodProxy.invokeSuper(o, objects);
        System.out.println("告罄~~~~~！");
        return null;
    }
}
