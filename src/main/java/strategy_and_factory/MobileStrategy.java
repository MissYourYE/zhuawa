package strategy_and_factory;


public class MobileStrategy implements RechargeStrategy {

    public Double calRecharge(Double rechargeAmount, RechargeTypeEnum type) {
        return rechargeAmount;
    }
}
