package vip.dengwj.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Arrays;
import java.util.Random;

// 游戏界面
public class GameJFrame extends JFrame {
    private int[][] data;

    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initMenu();
        // 初始化数据（打乱）
        initData();

        // 初始化图片
        initImage();

        this.setVisible(true);
    }

    // 打乱数据
    private void initData() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int idx = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        int[][] arr2 = new int[arr.length % 4 == 0 ? arr.length / 4 : (arr.length / 4) + 1][4];
        // 伪造索引思想
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr[index++];
            }
        }
        data = arr2;
    }

    private void initImage() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建一个图片 ImageIcon 的对象
                ImageIcon icon = new ImageIcon("puzzlegame/image/animal/animal3/" + data[i][j] + ".jpg");
                JLabel jLabel = new JLabel(icon);
                // 指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
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
