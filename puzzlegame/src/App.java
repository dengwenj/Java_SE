import vip.dengwj.ui.GameJFrame;
import vip.dengwj.ui.LoginJFrame;
import vip.dengwj.ui.RegisterJFrame;

public class App {
    // 程序的主入口
    public static void main(String[] args) {
        // 主窗体
        new GameJFrame();

        // 登录界面
        new LoginJFrame();

        // 注册界面
        new RegisterJFrame();
    }
}
