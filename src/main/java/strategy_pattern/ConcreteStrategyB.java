package strategy_pattern;

/**
 * 具体策略B
 *
 * @author dubaoming
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmLogic() {
        System.out.println("B算法");
    }
}
