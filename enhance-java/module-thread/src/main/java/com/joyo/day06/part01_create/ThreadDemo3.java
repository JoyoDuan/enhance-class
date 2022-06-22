package com.joyo.day06.part01_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


/**
 * 目标：方式三：实现Callable接口，结合FutureTask完成
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        // 3.创建Callable任务对象
        Callable<String> call = new JCallable(10);
        // 4.把Callable任务对象交给FutureTask
        FutureTask<String> futureTask = new FutureTask<>(call);

        // 5.交给线程处理
        Thread thread = new Thread(futureTask);
        // 6.启动线程
        thread.start();

        try {
            // 任务没有执行完毕，这里的代码会等待，直到线程1跑完才提取结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// 1.定义一个任务类 实现Callable接口
class JCallable implements Callable<String> {
    private int time;
    public JCallable(int time) {
        this.time = time;
    }

    // 2.重写call方法
    @Override
    public String call() throws Exception {
        int sum = 0;

        for (int i = 0; i < time; i++) {
            sum += i;
        }
        return "子线程执行的结果是：" + sum;
    }
}
