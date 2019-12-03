package factory_method_pattern;

/**
 * 抽象工厂角色
 * 此类是工厂方法模式的核心，是具体工厂必须实现的接口或者继承的父类。
 * 在Java中以接口或者抽象类来实现。
 * <p>
 * 优点：工厂方法模式解决了简单工厂模式中工厂类的方法压力会因为产品的增加而变大的问题。
 * 缺点：但是工厂方法模式每增加一个产品就或多一个具体工厂类，这样会导致类越来越多
 *
 * 总结：为什么叫工厂方法模式，它用一个个的具体工厂去替代简单工厂模式中的"工厂方法"，所以叫工厂方法模式
 *
 * @author dubaoming
 */
public interface PhoneFactory {
    AbstractHuaweiPhone createHuaweiPhone();
}
