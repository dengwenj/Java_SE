package vip.dengwj.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

// 游戏界面
public class GameJFrame extends JFrame implements KeyListener {
    private int[][] data;
    // 找打 0 的索引，就是空白
    private final int[] blankPosition = new int[2];
    // 图片路径
    private String path = "puzzlegame/image/animal/animal3/";
    // 是否胜利
    private boolean isWin = false;
    // 胜利的二维数组
    private final int[][] winArr = new int[][]{
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 0}
    };

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
                // 空白图片
                if (arr2[i][j] == 0) {
                    blankPosition[0] = i;
                    blankPosition[1] = j;
                }
            }
        }
        data = arr2;
    }

    private void initImage() {
        // 清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        // 胜利
        if (win()) {
            // 添加背景图片
            JLabel bgc = new JLabel(new ImageIcon("puzzlegame/image/win.png"));
            bgc.setBounds(200, 300, 197, 73);
            this.getContentPane().add(bgc);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建一个图片 ImageIcon 的对象
                ImageIcon icon = new ImageIcon(path + data[i][j] + ".jpg");
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

        // 刷新界面
        this.getContentPane().repaint();
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
        // 给整个界面添加键盘事件
        this.addKeyListener(this);
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        // 按的 A
        if (keyCode == 65) {
            // 先清除
            this.getContentPane().removeAll();

            // 添加完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(40, 65, 508, 560);
            this.getContentPane().add(all);

            // 添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    // 鼠标抬起
    @Override
    public void keyReleased(KeyEvent e) {
        if (win()) {
            return;
        }

        int keyCode = e.getKeyCode();

        int one = blankPosition[0];
        int two = blankPosition[1];
        int blank = data[one][two];
        int temp = 0;
        // 边界判断，空白在边上
        if (keyCode == 37) {
            // 空白在左边上
            if (two == data[one].length - 1) {
                return;
            }
            // 左，空白右边的位置左移动
            temp = data[one][two + 1];
            data[one][two + 1] = blank;
            data[one][two] = temp;
            blankPosition[1]++;
        } else if (keyCode == 38) {
            // 空白在下边上
            if (one == data.length - 1) {
                return;
            }
            // 上，空白下面的图片向上移动
            temp = data[one + 1][two];
            data[one + 1][two] = blank;
            data[one][two] = temp;
            blankPosition[0]++;
        } else if (keyCode == 39) {
            // 空白在右边上
            if (two == 0) {
                return;
            }
            // 右，空白左边的图片想右移动
            temp = data[one][two - 1];
            data[one][two - 1] = 0;
            data[one][two] = temp;
            blankPosition[1]--;
        } else if (keyCode == 40) {
            // 空白在上边上
            if (one == 0) {
                return;
            }
            // 下
            temp = data[one - 1][two];
            data[one - 1][two] = blank;
            data[one][two] = temp;
            blankPosition[0]--;
        } else if (keyCode == 87) {
            // 按的 W 胜利
            data = winArr;
        }
        initImage();
    }

    // 判断是否胜利
    private boolean win() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != winArr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
