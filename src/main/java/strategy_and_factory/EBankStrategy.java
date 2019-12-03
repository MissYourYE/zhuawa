package strategy_and_factory;

public class EBankStrategy implements RechargeStrategy {
    public Double calRecharge(Double rechargeAmount, RechargeTypeEnum type) {
        return rechargeAmount * 0.85;
    }
}
