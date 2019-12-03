package strategy_and_factory;

/**
 * 策略模式+工厂模式的好处在于，如果是单纯的策略模式，当调用new Context()时，需要传入一个具体的策略实例(new ConcreteStrategyA),
 * 而结合工厂模式则直接传入一个枚举值，由策略工厂代替new 来创建具体策略对象。
 * 由此可见，工厂模式的主旨在于帮助我们创建对象，提供了一个创建对象的统一入口。
 *
 * 策略模式的主旨是统一调用策略的入口，有策略中间者Context来帮助调用策略
 */
public class Context {

    private RechargeStrategy strategy;

    public Double calRecharge(Double rechargeAmount,Integer type){
        strategy = RechargeStrategyFactory.getInstance().creator(type);
        return strategy.calRecharge(rechargeAmount,RechargeTypeEnum.valueOf(type));
    }

    public RechargeStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RechargeStrategy strategy) {
        this.strategy = strategy;
    }
}
