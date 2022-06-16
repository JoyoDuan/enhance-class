package part01_create;

// 目标：方式一：继承Thread类创建多线程
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 3.new一个新线程
        JoyoThread thread = new JoyoThread();
        // 4.启动线程
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

// 1.定义线程类，继承Thread
class JoyoThread extends Thread {
    // 2.重写run方法，定义线程要干嘛
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*****子线程执行输出：" + i);
        }
    }
}
