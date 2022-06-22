package com.joyo.day06.part01_create.clazz;

/**
 * 目标：学会使用继承Thread类创建线程
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        JTread jTread = new JTread();
        // 3.启动线程
        jTread.start();

        // 主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行：" + i);
        }
    }
}

// 1.定义一个线程类
class JTread extends Thread {

    // 2.线程具体的执行任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行：" + i);
        }
    }
}
