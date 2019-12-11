package command_pattern;

public class MsiMainBord implements MainBordApi{
    @Override
    public void startUp() {
        System.out.println("微星主板正在开机，请等候。。。。");
        System.out.println("电路检查。。。。");
        System.out.println("开机完毕~~~~~~");
    }
}
