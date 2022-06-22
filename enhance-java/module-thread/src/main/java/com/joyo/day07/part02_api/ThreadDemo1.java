package com.joyo.day07.part02_api;


/**
 * 目标：学会使用线程的api
 */
public class ThreadDemo1 {
    // main方法是由主线程负责调度的
    public static void main(String[] args) {
        Thread thread1 = new JThread("线程1号");
        thread1.start();
        System.out.println(thread1.getName());

        Thread thread2 = new JThread("线程2号");
        thread2.start();
        System.out.println(thread2.getName());

        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        main.setName("超级线程");

        for (int i = 0; i < 5; i++) {
            System.out.println( main.getName() + "输出：" + i);
        }
    }
}
