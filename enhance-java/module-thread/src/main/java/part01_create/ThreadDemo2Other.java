package part01_create;

/**
 * 目标：使用匿名内部类方式实现
 */
public class ThreadDemo2Other {
    public static void main(String[] args) {
        // 方式一
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1执行输出：" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();


        // 方式二
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2执行输出：" + i);
                }
            }
        }).start();


        // 方式三
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程3执行输出：" + i);
            }
        }).start();


        for (int i = 0; i < 5; i++) {
            System.out.println("*****主线程执行输出：" + i);
        }
    }
}
