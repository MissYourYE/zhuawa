package simple_factory_pattern;

/**
 * 具体产品角色，工厂创建的实例，就是此角色的实例
 */
public class HuaweiMate9 extends AbstractHuaweiPhone {

    public HuaweiMate9() {
        System.out.println("生产==》HuaweiMate9");
    }
}
