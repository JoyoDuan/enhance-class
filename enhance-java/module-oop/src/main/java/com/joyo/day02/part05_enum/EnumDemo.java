package com.joyo.day02.part05_enum;


import javax.swing.*;
import java.awt.event.ActionEvent;


/**
 * 目标：理解常量的其它作用，可以用作配置文件
 */
public class EnumDemo {

    public static void main(String[] args) {
        // 1、创建一个窗口对象（桌子）
        JFrame frame = new JFrame();
        // 2.创建一个面板对象（桌布）
        JPanel panel = new JPanel();
        // 3、把桌布垫在桌子上
        frame.add(panel);

        // 4、创建四个按钮对象
        JButton btn1 = new JButton("上");
        JButton btn2 = new JButton("下");
        JButton btn3 = new JButton("左");
        JButton btn4 = new JButton("右");

        // 5、把按钮对象添加到桌布上去
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        // 6.显示窗口
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 400);
        frame.setVisible(true);

        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exec(Orientation.UP); // 玛丽跳一下
            }
        });
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exec(Orientation.DOWN) ; // 让玛丽往下蹲
            }
        });
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exec(Orientation.LEFT) ; // 让玛丽往左跑
            }
        });
        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exec(Orientation.RIGHT) ; // 让玛丽往右跑
            }
        });
    }

    public static void exec(Orientation orientation) {
        switch (orientation) {
            case UP:
                System.out.println("玛丽往↑跳了一下");
                break;
            case DOWN:
                System.out.println("玛丽往↓蹲一下");
                break;
            case LEFT:
                System.out.println("玛丽往←跑");
                break;
            case RIGHT:
                System.out.println("玛丽往→跑");
                break;
        }
    }
}
