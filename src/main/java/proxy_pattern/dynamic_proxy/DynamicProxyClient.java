package proxy_pattern.dynamic_proxy;

import proxy_pattern.static_proxy.SellAirJordan;
import proxy_pattern.static_proxy.SellShoes;

public class DynamicProxyClient {

    public static void main(String[] args) {
        JDKDynamicProxySellHandler JDKDynamicProxySellHandler = new JDKDynamicProxySellHandler();
        SellShoes sellShoes = (SellShoes) JDKDynamicProxySellHandler.newDynamicProxySellInstance(new SellAirJordan());
        sellShoes.sellAj1();
        System.out.println("=================");
        JDKDynamicProxySellHandler JDKDynamicProxySellHandler1 = new JDKDynamicProxySellHandler();
        SellCars sellCars = (SellCars) JDKDynamicProxySellHandler1.newDynamicProxySellInstance(new SellCarsImpl());
        sellCars.sellAodi();
    }

}
