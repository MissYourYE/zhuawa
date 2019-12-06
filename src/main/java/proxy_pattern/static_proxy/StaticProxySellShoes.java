package proxy_pattern.static_proxy;

/**
 * 代理模式==>代理角色
 * 此角色实现了和真实角色相同的接口。
 * 由于代理类和委托类实现了相同的借口，想调用委托类的方法，都可以直接从代理类调用。从而有效的控制了对委托对象的直接访问。
 * 代理类可以对委托类进行功能的扩充，为实施不同的控制策略预留了空间。使设计变得更加灵活。
 *
 * 优点：当两个类需要通信的时候，引入此第三方代理类，讲两个类的关系解耦。
 * 缺点：
 * 1、由于代理类和委托类实现了抽象角色接口，所以抽象角色每增加一个方法，则代理类都要去实现它，
 * 如果代理类中不对委托类中的方法进行额外的扩充，就会出现冗余代码，也增加了代码维护的复杂度。
 * 2、代理对象只服务一种类型的委托类，如果想要服务多个类型的委托类（比如卖车，买房，卖电脑。。。。），
 * 此时就需要为每种委托类型都创建一个代理类，如果也仅仅是想要在委托方法前后加上同样的扩充，
 * 那么在程序规模大的情况下，静态代理就无法胜任了。
 */
public class StaticProxySellShoes implements SellShoes {

    private SellShoes sellShoes;

    public StaticProxySellShoes(SellShoes sellShoes){
        this.sellShoes = sellShoes;
    }

    private void preLog(){
        System.out.println("准备开始售卖~~~~！");
    }

    private void afterLog(){
        System.out.println("告罄~~~~！");
    }

    @Override
    public void sellAj1() {
        //对方法进行额外的扩充
        preLog();
        System.out.println("售卖Aj1");
        afterLog();
    }

    @Override
    public void sellAj2() {
        System.out.println("售卖Aj1");
    }

    @Override
    public void sellAj3() {
        System.out.println("售卖Aj1");
    }

    @Override
    public void sellAj4() {
        System.out.println("售卖Aj1");
    }

    @Override
    public void sellAj5() {
        System.out.println("售卖Aj1");
    }
}
