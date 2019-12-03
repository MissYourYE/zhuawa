package factory_method_pattern;

public class Customer {
    public static void main(String[] args) {
        HuaweiMate9Factory huaweiMate9Factory = new HuaweiMate9Factory();
        AbstractHuaweiPhone mate9 = huaweiMate9Factory.createHuaweiPhone();

        HuaweiMate10Factory huaweiMate10Factory = new HuaweiMate10Factory();
        AbstractHuaweiPhone mate10 = huaweiMate10Factory.createHuaweiPhone();
    }
}
