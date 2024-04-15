package vip.dengwj.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    public JButton jButton = new JButton("按钮");
    public JButton jButton2 = new JButton("按钮2");

    public MyJFrame() {
        this.setSize(500, 500);
        this.setTitle("事件");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jButton.setBounds(0, 0, 100, 100);
        jButton2.setBounds(100, 0, 100, 50);
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

        this.getContentPane().add(jButton);
        this.getContentPane().add(jButton2);
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
}
