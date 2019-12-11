package command_pattern;

/**
 * 命令模式==>命令接收者角色（Receiver）
 * 技嘉主板类，是命令的真正实现类
 */
public class GigaMainBord implements MainBordApi {

    /**
     * 开机命令的真正实现
     */
    @Override
    public void startUp() {
        System.out.println("技嘉主板正在开机，请等候。。。。");
        System.out.println("电路检查。。。。");
        System.out.println("加载系统。。。。");
        System.out.println("开机完毕~~~~~~");
    }
}
