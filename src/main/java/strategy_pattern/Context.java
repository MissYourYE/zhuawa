package strategy_pattern;

/**
 * 封装角色
 * 它是上游访问策略的入口，它持有抽象策略的引用，并提供调用策略的方法
 *
 * @author dubaoming
 */
public class Context {

    private Strategy strategy;

    /**
     * 传入的参数是一个具体的策略
     *
     * @param strategy 具体策略
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略
     */
    public void contextInterface() {
        strategy.algorithmLogic();
    }
}
