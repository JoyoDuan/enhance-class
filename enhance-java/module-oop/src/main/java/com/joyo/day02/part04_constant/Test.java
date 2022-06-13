package com.joyo.day02.part04_constant;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test {

    public static final String UP = "100";
    public static final String DOWN = "2";
    public static final String LEFT = "3";
    public static final String RIGHT = "4";

    public static void main(String[] args) {
        // 桌子
        JFrame frame = new JFrame("超级玛丽");
        // 桌布
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button1 = new JButton("↑");
        JButton button2 = new JButton("↓");
        JButton button3 = new JButton("←");
        JButton button4 = new JButton("→");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // 显示窗口
        frame.setLocationRelativeTo(null);
        frame.setSize(320, 480);
        frame.setVisible(true);

        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run(UP);
            }
        });
        button2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run("2");
            }
        });
        button3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run("3");
            }
        });
        button4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run("4");
            }
        });
    }


    public static void run(String flag) {
        switch (flag) {
            case UP:
                System.out.println("玛丽向↑跳了一下");
                break;
            case DOWN:
                System.out.println("玛丽向↓蹲了一下");
                break;
            case LEFT:
                System.out.println("玛丽向←走了一下");
                break;
            case RIGHT:
                System.out.println("玛丽向→跑了一下");
                break;
        }
    }
}
