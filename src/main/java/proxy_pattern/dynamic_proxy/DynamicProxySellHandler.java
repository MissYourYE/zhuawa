package proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理核心实现
 * 动态代理解决了静态代理可能会出现代码冗余的情况
 * 可以代理任何对象任何方法。
 *
 * 优点：使我们的代码职责更加单一，复用性更强。
 */
public class DynamicProxySellHandler implements InvocationHandler {

    private Object entrustObj;

    public Object newDynamicProxySellInstance(Object entrustObj){
        this.entrustObj = entrustObj;
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
