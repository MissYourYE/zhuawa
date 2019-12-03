package factory_method_pattern;

/**
 * 具体产品角色,继承抽象产品角色
 *
 * @author dubaoming
 */
public class HuaweiMate10 extends AbstractHuaweiPhone {

    public HuaweiMate10() {
        System.out.println("生产==》HuaweiMate10");
    }
}
