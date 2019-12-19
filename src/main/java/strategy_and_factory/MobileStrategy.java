package strategy_and_factory;


public class MobileStrategy implements RechargeStrategy {

    @Override
    public Double calRecharge(Double rechargeAmount, RechargeTypeEnum type) {
        return rechargeAmount;
    }
}
