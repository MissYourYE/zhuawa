package simple_factory_pattern;

/**
 * 工厂类角色，就是一个直接创建的类
 * 此类是简单工厂模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品对象。
 * <p>
 * 缺点：如果type过多，也就是产品过多，那么工厂方法会很长
 * 优点：实现了单一职能原则，产品类只负责实现，不负责创建，将产品的创建进行共性的抽象提取
 * <p>
 * 总结：为什么称之为简单工厂模式，就是因为工厂规模比较小，所生产的产品品类比较少，所以它比较"简单"
 * 如果产品会变得很多的话，简单工厂模式就不适合了。
 *
 * @author dubaoming
 */
public class PhoneFactory {

    public AbstractHuaweiPhone createHuaweiPhone(int type) {
        switch (type) {
            case 9:
                return new HuaweiMate9();

            case 10:
                return new HuaweiMate10();
            default:
                break;
        }
        return null;
    }
}
