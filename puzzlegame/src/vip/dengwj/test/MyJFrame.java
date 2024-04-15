package vip.dengwj.test;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener, MouseListener, KeyListener {
    public JButton jButton = new JButton("按钮");
    public JButton jButton2 = new JButton("按钮2");
    public JButton jButton3 = new JButton("鼠标监听");

    public MyJFrame() {
        this.setSize(500, 500);
        this.setTitle("事件");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jButton.setBounds(0, 0, 100, 100);
        jButton2.setBounds(100, 0, 100, 50);
        jButton3.setBounds(200, 0, 100, 50);
        // 添加动作事件，匿名内部类的方式
        /*jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource());
            }
        });*/

        // 实现类的方式
        jButton.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addMouseListener(this);

        // 键盘监听，要把其他事件注释掉才生效
        this.addKeyListener(this);

        this.getContentPane().add(jButton);
        this.getContentPane().add(jButton2);
        this.getContentPane().add(jButton3);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            jButton.setSize(200, 300);
        } else if (e.getSource() == jButton2) {
            Random r = new Random();
           jButton2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }

    /**
     * 鼠标事件
     */
    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标退出");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("键盘按下");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("键盘松开");
    }
}
