package command_pattern;

/**
 * 命令模式==>调用者（invoker）
 * <p>
 * 对接收者，命令的组装
 */
public class Box {

    private Command startUpCommand;

    public void setStartUpCommand(Command startUpCommand) {
        this.startUpCommand = startUpCommand;
    }

    public void pressStartUpButton() {
        startUpCommand.excute();
    }

}
