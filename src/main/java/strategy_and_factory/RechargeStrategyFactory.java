package strategy_and_factory;

import java.util.HashMap;
import java.util.Map;

public class RechargeStrategyFactory {

    private static RechargeStrategyFactory factory = new RechargeStrategyFactory();

    public RechargeStrategyFactory() {
    }

    private static Map<Integer, RechargeStrategy> strategyMap = new HashMap<Integer, RechargeStrategy>();

    //此处代替了简单工厂模式中的swich分支结构
    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.code(),new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNT.code(),new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.code(),new MobileStrategy());
    }

    public RechargeStrategy creator(Integer type){
        return strategyMap.get(type);
    }

    public static RechargeStrategyFactory getInstance(){
        return factory;
    }
}
