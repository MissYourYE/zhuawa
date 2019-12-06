package proxy_pattern.static_proxy;

/**
 * 代理模式角色==>抽象角色
 * 委托类和代理类通常同时实现此接口，这样做的目的是为了保持行为的一致性。
 * 所以在访问者看来，两者没有丝毫区别。
 */
public interface SellShoes {
    void sellAj1();

    void sellAj2();

    void sellAj3();

    void sellAj4();

    void sellAj5();
}
