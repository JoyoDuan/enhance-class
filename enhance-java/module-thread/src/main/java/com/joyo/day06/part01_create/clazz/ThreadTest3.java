package com.joyo.day06.part01_create.clazz;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 目标：通过实现Callable接口和FutureTask来创建线程
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        // 3.实例化CallableThread对象
        CallableThread callableThread = new CallableThread(10);
        // 4.定义任务执行器
        FutureTask<Integer> futureTask = new FutureTask<>(callableThread);

        // 5.交给线程来执行任务
        Thread thread = new Thread(futureTask);
        thread.start();

        // 6.获取线程执行结果
        try {
            Integer sum = futureTask.get(); // 获取结果会等待线程执行完毕
            System.out.println("线程执行的结果为：" + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行：" + i);
        }
    }
}


// 1.定义线程
class CallableThread implements Callable<Integer> {
    private int time = 0;
    private int sum = 0;

    public CallableThread() {}

    public CallableThread(int time) {
        this.time = time;
    }

    // 2.线程需要执行的任务
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < time; i++) {
            sum += i;
        }

        return sum;
    }
}
