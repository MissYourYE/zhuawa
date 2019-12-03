package simple_factory_pattern;

public class Customer {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        //生产==》HuaweiMate9
        //生产==》HuaweiMate10
        AbstractHuaweiPhone huaweiMate9 = phoneFactory.createHuaweiPhone(9);
        AbstractHuaweiPhone huaweiMate10 = phoneFactory.createHuaweiPhone(10);
    }
}
