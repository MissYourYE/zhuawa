package command_pattern;

/**
 * 命令模式==>具体命令角色
 * 持有一个接收者角色，当调用者发送命令时，命令角色会调用接收者中的具体命令
 */
public class StartUpCommand implements Command {

    private MainBordApi mainBordApi;

    public StartUpCommand(MainBordApi mainBordApi) {
        this.mainBordApi = mainBordApi;
    }

    @Override
    public void excute() {
        mainBordApi.startUp();
    }
}
