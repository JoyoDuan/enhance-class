package part01_create;

/**
 * 目标：方式二：学会使用继承Runnable接口
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        // 3.创建一个任务对象
        Runnable target = new JRunnable();

        // 4.把任务对象交给Thread处理
        Thread thread = new Thread(target);
        // Thread thread = new Thread(target, "1号");
        // 5、启动线程
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}


// 1.定义线程，使用实现Runnable接口
class JRunnable implements Runnable {

    // 2.定义线程要执行的方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*****子线程执行输出：" + i);
        }
    }
}
