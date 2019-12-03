package strategy_pattern;

/**
 * 业务调用方
 */
public class Client {

    public static void main(String[] args) {

        //A算法
        //B算法
        Context contextA = new Context(new ConcreteStrategyA());
        contextA.contextInterface();

        Context contextB = new Context(new ConcreteStrategyB());
        contextB.contextInterface();
    }
}
