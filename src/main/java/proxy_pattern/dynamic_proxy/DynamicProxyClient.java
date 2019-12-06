package proxy_pattern.dynamic_proxy;

import proxy_pattern.static_proxy.SellAirJordan;
import proxy_pattern.static_proxy.SellShoes;

public class DynamicProxyClient {

    public static void main(String[] args) {
        DynamicProxySellHandler dynamicProxySellHandler = new DynamicProxySellHandler();
        SellShoes sellShoes = (SellShoes) dynamicProxySellHandler.newDynamicProxySellInstance(new SellAirJordan());
        sellShoes.sellAj1();
        System.out.println("=================");
        DynamicProxySellHandler dynamicProxySellHandler1 = new DynamicProxySellHandler();
        SellCars sellCars = (SellCars)dynamicProxySellHandler1.newDynamicProxySellInstance(new SellCarsImpl());
        sellCars.sellAodi();
    }

}
