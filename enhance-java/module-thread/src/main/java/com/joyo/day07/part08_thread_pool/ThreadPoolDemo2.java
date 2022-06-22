package com.joyo.day07.part08_thread_pool;


import java.util.concurrent.*;

/**
 * 目标：自定义一个线程池对象，并测试其特性
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.创建线程池对象
        /**
         * public ThreadPoolExecutor(int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // 2.把任务交给线程池处理
        Future<String> f1 = pool.submit(new MyCallable(10));
        Future<String> f2 = pool.submit(new MyCallable(20));
        Future<String> f3 = pool.submit(new MyCallable(30));
        Future<String> f4 = pool.submit(new MyCallable(40));
        Future<String> f5 = pool.submit(new MyCallable(50));

        // 3.获取线程执行结果
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());
    }
}
