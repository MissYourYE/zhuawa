package proxy_pattern.jdk_dynamic_proxy;

import proxy_pattern.static_proxy.SellAirJordan;
import proxy_pattern.static_proxy.SellShoes;

public class JdkDynamicProxyClient {

    public static void main(String[] args) {
        JdkDynamicProxySellHandler dynamicProxySellHandler = new JdkDynamicProxySellHandler();
        SellShoes sellShoes = (SellShoes) dynamicProxySellHandler.newDynamicProxySellInstance(new SellAirJordan());
        sellShoes.sellAj1();
        System.out.println("=================");
        JdkDynamicProxySellHandler dynamicProxySellHandler1 = new JdkDynamicProxySellHandler();
        SellCars sellCars = (SellCars)dynamicProxySellHandler1.newDynamicProxySellInstance(new SellCarsImpl());
        sellCars.sellAodi();
    }

}
