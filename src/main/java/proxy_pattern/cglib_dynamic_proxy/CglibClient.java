package proxy_pattern.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;

public class CglibClient {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SellComputer.class);
        enhancer.setCallback(new MyMethodInterceptor());

        SellComputer sellComputer = (SellComputer) enhancer.create();
        sellComputer.sellMacAir();
    }

}
