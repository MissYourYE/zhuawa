package proxy_pattern.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理核心实现
 * 动态代理解决了静态代理可能会出现代码冗余的情况
 * 可以代理任何对象任何方法。
 *
 * 优点：使我们的代码职责更加单一，复用性更强。
 * 缺点：委托类必须实现接口，才能被代理
 *
 * 原理：通过反射来实现，借助Java自带的java.lang.reflect.Proxy,通过固定的规则生成。
 * 利用拦截器（拦截器必须实现InvocationHandler接口）加上反射机制生成一个实现代理接口的匿名类，
 * 在调用具体方法前调用IvocationHandler来处理。只能对实现了接口的委托类生成代理。
 */
public class JdkDynamicProxySellHandler implements InvocationHandler {

    private Object entrustObj;

    public Object newDynamicProxySellInstance(Object entrustObj){
        this.entrustObj = entrustObj;
        //参数1：委托类的类加载器
        //参数2：委托类的接口数组，这就是jdk的缺陷，委托类必须要实现接口才行
        //参数3：InvocationHandler
        return Proxy.newProxyInstance(entrustObj.getClass().getClassLoader(),
                entrustObj.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备开始售卖~~~~！");
        method.invoke(entrustObj,args);
        System.out.println("告罄~~~~！");
        return null;
    }
}
