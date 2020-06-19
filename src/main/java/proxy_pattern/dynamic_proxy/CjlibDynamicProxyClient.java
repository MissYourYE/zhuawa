package proxy_pattern.dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class CjlibDynamicProxyClient {
    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SellShoes.class);
        enhancer.setCallback(new CjlibInterceptor());
        SellShoes sellShoes = (SellShoes) enhancer.create();
        sellShoes.sellAj1();
    }
}
