package command_pattern;

/**
 * 客户端角色
 * 我们可以看到请求发送者和请求接收者没有直接的联系，而是通过具体命令做关联。
 *
 */
public class Client {

    public static void main(String[] args) {


        // 创建接收者
        Receiver receiver = new Receiver();


        // 创建命令对象，设定它的接收者
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);



        // 创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(concreteCommand);
        // 执行方法
        invoker.action();
    }

}
