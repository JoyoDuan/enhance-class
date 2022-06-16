package part02_api;

public class JThread extends Thread {
    public JThread() {
    }

    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
    }
}

