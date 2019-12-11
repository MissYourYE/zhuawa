package command_pattern;

/**
 * 客户端
 *
 * 当我们想对某一个主机（box）进行开机操作时，我们只需要按下开机键即可。
 * 我们不关心主机的开机按钮后面的执行命令逻辑是什么，用的是什么主板，都用的是什么指令
 * 而开机按钮也不关心具体是哪个主板执行命令，它交给"开机命令"即可，而开机命令关联的是具体的哪个主板的开机流程命令
 *
 * 我们想请求主机对象的开机功能，我们并不知道接收者是技嘉主板，
 * 由此，我们通过一个命令将两者关联起来，将请求对象和接收对象解耦
 *
 * 缺点：当命令过多时，我们需要为每个命令都去设计一个具体的命令类，因此某些系统会有大量的具体命令类。
 */
public class OrderClient {

    public static void main(String[] args) {
        Box box = new Box();
        MainBordApi gigaMainBord = new GigaMainBord();
        Command startUpCommand = new StartUpCommand(gigaMainBord);
        box.setStartUpCommand(startUpCommand);
        box.pressStartUpButton();
        System.out.println("=================");
        Box box1 = new Box();
        MsiMainBord msiMainBord = new MsiMainBord();
        Command startUpCommand1 = new StartUpCommand(msiMainBord);
        box1.setStartUpCommand(startUpCommand1);
        box1.pressStartUpButton();
    }

}
