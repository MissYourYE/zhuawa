package simple_factory_pattern;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Customer {

    public static void main(String[] args) {

        //生产==》HuaweiMate9
        //生产==》HuaweiMate10
        AbstractHuaweiPhone huaweiMate9 = PhoneFactory.createHuaweiPhone(9);
        AbstractHuaweiPhone huaweiMate10 = PhoneFactory.createHuaweiPhone(10);
        ArrayList<String> strings = new ArrayList<>();
    }
}
