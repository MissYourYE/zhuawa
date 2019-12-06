package proxy_pattern.static_proxy;

/**
 * 代理模式==>真实角色
 * 又称委托对象，其实外界调用代理类方法时，真正想调用的是此角色的方法。
 */
public class SellAirJordan implements SellShoes {

    @Override
    public void sellAj1() {
        System.out.println("售卖Aj1");
    }

    @Override
    public void sellAj2() {
        System.out.println("售卖Aj2");
    }

    @Override
    public void sellAj3() {
        System.out.println("售卖Aj3");
    }

    @Override
    public void sellAj4() {
        System.out.println("售卖Aj4");
    }

    @Override
    public void sellAj5() {
        System.out.println("售卖Aj5");
    }
}
