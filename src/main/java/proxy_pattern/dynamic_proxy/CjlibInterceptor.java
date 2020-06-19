package proxy_pattern.dynamic_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CjlibInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始售卖Aj1～～～");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("售罄～～～");
        return o1;
    }
}
