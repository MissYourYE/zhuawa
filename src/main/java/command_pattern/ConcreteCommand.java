package command_pattern;

/**
 * 具体命令角色
 */
public class ConcreteCommand implements Command {

    /**
     * 持有相应的接收者对象
     */
    private Receiver receiver = null;

    /**
     * 构造方法
     */
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        // 通常会中转调用接收者的相应方法，让接收者来执行功能。
        receiver.action();
    }
}
