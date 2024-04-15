package vip.dengwj.ui;

import javax.swing.*;

// 游戏界面
public class GameJFrame extends JFrame {
    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initMenu();
        // 初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initImage() {
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建一个图片 ImageIcon 的对象
                ImageIcon icon = new ImageIcon("/Users/dengwenjie/Java/java_learn/puzzlegame/image/animal/animal3/" + num + ".jpg");
                JLabel jLabel = new JLabel(icon);
                // 指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                this.getContentPane().add(jLabel);
                num++;
            }
        }
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // xy
        this.setLayout(null);
    }

    private void initMenu() {
        // 初始化菜单
        String[] menus = {"功能", "关于我们"};
        String[][] menuItems = {
            {"重新游戏", "重新登录", "关闭游戏"},
            {"简介"}
        };
        JMenuBar jMenuBar = new JMenuBar();
        for (int i = 0; i < menus.length; i++) {
            JMenu jMenu = new JMenu(menus[i]);
            for (int j = 0; j < menuItems[i].length; j++) {
                jMenu.add(new JMenuItem(menuItems[i][j]));
            }
            jMenuBar.add(jMenu);
        }
        // 给整个页面设置菜单
        this.setJMenuBar(jMenuBar);
    }
}
