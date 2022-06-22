package com.joyo.day06.part01_create.clazz;

/**
 * 第二种创建线程的方式
 * 目标：实现Runnable接口创建线程
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        JThread target = new JThread();
        // 3.启动线程
        Thread thread = new Thread(target);
        thread.start();

        // 主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行：" + i);
        }
    }
}


// 1.定义线程类
class JThread implements Runnable {

    // 2.线程具体的执行任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行：" + i);
        }
    }
}
