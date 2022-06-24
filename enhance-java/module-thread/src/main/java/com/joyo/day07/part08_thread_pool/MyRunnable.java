package com.joyo.day07.part08_thread_pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "执行输出了'您好！老王... => '" + i);
        }

        try {
            System.out.println(Thread.currentThread().getName() + "线程进入了休眠");
            System.out.println("**********************************");
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
