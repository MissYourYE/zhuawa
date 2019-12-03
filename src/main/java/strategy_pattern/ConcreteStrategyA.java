package strategy_pattern;

/**
 * 具体策略角色
 *
 * @author dubaoming
 */
public class ConcreteStrategyA implements Strategy {

    public void algorithmLogic() {
        System.out.println("A算法");
    }
}
