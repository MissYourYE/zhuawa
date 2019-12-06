package command_pattern;

/**
 * 请求者角色
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command = null;

    public Invoker(Command command){
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action(){
        command.excute();
    }

}
