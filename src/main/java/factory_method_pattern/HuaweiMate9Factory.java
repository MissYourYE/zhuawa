package factory_method_pattern;

/**
 * 具体工厂角色
 * 此类含有具体的业务逻辑
 *
 * @author dubaoming
 */
public class HuaweiMate9Factory implements PhoneFactory {

    @Override
    public AbstractHuaweiPhone createHuaweiPhone() {
        return new HuaweiMate9();
    }
}
