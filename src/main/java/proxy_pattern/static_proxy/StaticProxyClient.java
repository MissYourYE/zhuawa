package proxy_pattern.static_proxy;

/**
 * 业务调用者
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        StaticProxySellShoes staticProxySellShoes = new StaticProxySellShoes(new SellAirJordan());
        staticProxySellShoes.sellAj1();
    }
}
