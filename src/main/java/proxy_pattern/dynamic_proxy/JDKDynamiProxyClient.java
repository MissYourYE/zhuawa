package proxy_pattern.dynamic_proxy;

import org.junit.Test;

public class JDKDynamiProxyClient {
    @Test
    public void jdkProxyTest(){
        JDKDynamicProxySellHandler jdkDynamicProxySellHandler = new JDKDynamicProxySellHandler();
        SellCars sellCars = (SellCars)jdkDynamicProxySellHandler.newDynamicProxySellInstance(new SellCarsImpl());
        sellCars.sellBenci();
    }
}
